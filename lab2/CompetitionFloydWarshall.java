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
 * This class implements the competition using Floyd-Warshall algorithm
 */

public class CompetitionFloydWarshall {

    /**
	  	
     * @param filename: A filename containing the details of the city road network
	  	
     * @param sA, sB, sC: speeds for 3 contestants
	  	
     */
    double[][] dist;
    int slowSpeed;
    boolean allowed = true;
    CompetitionFloydWarshall  (String filename, int sA, int sB, int sC) {  	
        try {
            Scanner inputScanner = new Scanner(new File(filename));
            int v = inputScanner.nextInt();  // getting vertices
            if (v <= 0) { 
                allowed = false;
            }else { 
                allowed = true ;
            }
            dist = new double[v][v];
            for (int i = 0; i < v; i++) {
                Arrays.fill(dist[i], Double.POSITIVE_INFINITY); // setting to infinity
                dist[i][i] = 0.0;
            }
            int e = inputScanner.nextInt(); // set current edge has shortest paths
            for (int i = 0; i < e; i++) {
                int origin = inputScanner.nextInt();
                int destination = inputScanner.nextInt();
                double weight = inputScanner.nextDouble();
                dist[origin][destination] = weight;
            }
            //implementing Warshall Algo
            for (int k = 0; k < v; k++) {
                for (int i = 0; i < v; i++) {
                    for (int j = 0; j < v; j++) {
                        if (dist[i][k] + dist[k][j] < dist[i][j])
                            dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
            slowSpeed = Math.min(Math.min(sA, sB), sC);
            if (slowSpeed < 0) allowed = false;
            inputScanner.close();
        } catch (Exception e) {
            allowed = false;
        }
    }	  	 
    /**
	  	
     * @return int: minimum minutes that will pass before the three contestants can meet
	  	
     */
	  	
    public int timeRequiredforCompetition(){
        if (!allowed) return -1;
        double max = Double.NEGATIVE_INFINITY;	  	
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) { 
                if (dist[i][j] != Double.POSITIVE_INFINITY)
                    max = Math.max(max, dist[i][j]);
                else
                    return -1;
            }
        }
        double timeTaken = max*1000.0/(slowSpeed);
        return (int) Math.ceil(timeTaken);
    }  	
}
