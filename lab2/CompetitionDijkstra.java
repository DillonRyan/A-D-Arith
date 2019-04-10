import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/*
 * A Contest to Meet (ACM) is a reality TV contest that sets three contestants at three random
 * city intersections. In order to win, the three contestants need all to meet at any intersection
 * of the city as fast as possible.
 * It should be clear that the contestants may arrive at the intersections at different times, in
 * which case, the first to arrive can wait until the others arrive.
 * From an estimated walking speed for each one of the three contestants, ACM wants to determine the
 * minimum time that a live TV broadcast should last to cover their journey regardless of the contestants’
 * initial positions and the intersection they finally meet. You are hired to help ACM answer this question.
 * You may assume the following:
 *     Each contestant walks at a given estimated speed.
 *     The city is a collection of intersections in which some pairs are connected by one-way
 * streets that the contestants can use to traverse the city.
 *
 * This class implements the competition using Dijkstra's algorithm
 */

public class CompetitionDijkstra {
	private double[][] graph;
    int slowSpeed;
	private double longestShortestPath = Double.NEGATIVE_INFINITY;
	/**
	 * 
	 * @param filename:
	 *            A filename containing the details of the city road network
	 * 
	 * @param sA, sB, sC: speeds for 3 contestants
	 *            
	 * 
	 */

	CompetitionDijkstra(String filename, int sA, int sB, int sC) {

		try { 
			Scanner inputScanner = new Scanner(new File(filename));
			int v = inputScanner.nextInt();
			graph = new double[v][v];
			for (int i = 0; i < v; i++) {
				Arrays.fill(graph[i], Double.POSITIVE_INFINITY); // Setting all values to infinity
				graph[i][i] = 0.0;
			}
			int e = inputScanner.nextInt(); // getting edges
			for (int i = 0; i < e; i++) {
				int origin = inputScanner.nextInt();
				int destination = inputScanner.nextInt();
				double value = inputScanner.nextDouble();
				graph[origin][destination] = value;
			}
			// implementing Dijkstras algo
			for (int i = 0; i < v; i++) {
				double[] cost = graph[i].clone();
				boolean[] Q = new boolean[v];
				Q[i] = true;
				int count = 1;
				while (count < v) {
					double lowestCost = Double.POSITIVE_INFINITY; // that the node with lowest cost that hasnt been visited
					int u = -1; // Default value
					for (int j = 0; j < v; j++) {
						if (!Q[j]) {
							if (lowestCost > cost[j]) {
								lowestCost = cost[j];
								u = j;
							}
						}
					}
					if (u == -1) {  
						longestShortestPath = Double.POSITIVE_INFINITY; // graph not connected
						return;
					}
					Q[u] = true;
					count++;
					double[] neighbours = graph[u];
					for (int j = 0; j < v; j++) {
						if (neighbours[j] != 0 || neighbours[j] != Double.POSITIVE_INFINITY) {
							cost[j] = Math.min(cost[j], cost[u] + neighbours[j]);
						}
					}
				}
				for (double c : cost) {
					longestShortestPath = Math.max(longestShortestPath, c);
				}
			}
			slowSpeed = Math.min(Math.min(sA, sB), sC);
			inputScanner.close();
		} catch (Exception e) {
			longestShortestPath = Double.POSITIVE_INFINITY;
		}
	}  

	/**
	 * 
	 * @return int: minimum minutes that will pass before the three contestants can
	 *         meet
	 * 
	 */

	public int timeRequiredforCompetition() {
		if (longestShortestPath == Double.POSITIVE_INFINITY)
			return -1;
		//if (longestShortestPath == Double.NEGATIVE_INFINITY)
		//	return -1;
		if (slowSpeed <= 0)
			return -1;
		double timeTaken = longestShortestPath * 1000.0 / (slowSpeed);
		return (int) Math.ceil(timeTaken);
	}
}