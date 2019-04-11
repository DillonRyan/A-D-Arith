import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
	 * 1. Justify the choice of the data structures used in CompetitionDijkstra and
		  CompetitionFloydWarshall
		  
		  The data structure i choose to use was a 2D array to represent the graph as an adjacency matrix. It is a convenient 
		  way to represent the graph. Any edges have a non zero, non-infinity value and the two points connecting them can be found by
		  two indexes. I could've also used an adjacency list for  dijkstra which is built from shortest edges. The main problem with using the adjacncy matrix
		  is that it would waste space in all but a fully connected graphs. FW is also represented using a 2d array. The graph represents the shortest path 
		  between all pairs
		  
		  
		  
	   2. Explain theoretical differences in the performance of Dijkstra and Floyd-Warshall algorithms
		   in the given problem. Also explain how would their relative performance be affected by the
		   density of the graph. Which would you choose in which set of circumstances and why? 
			
			For this problem Dijkstra performs O(V^3); O(V^2) if no queue is used. O(elogV) if a queue or heap is used. this runs V times
			In our problem we need to find the highest cost of all source-destination pairs so each node needs t be the source at some point.
			For FW its preformance is O(V^3) as it generates the lowest cost for all source-destination pairs but the triple nested for loops 
			make it O(V^3)
			
			In a sparse graph, the lower amount of edges would mean that Dijkstra will run less times. But for FW, the cost is a constant O(V^3)
			which would be significantly more costly in a sparse graph. It is the opposite in a dense graph though as the more edges will make Dijkstras run 
			for longer but FW will stay constant. In sparse graphs Dijkstras is better but in dense graphs FW is better
	 */


public class CompetitionTests {


  	
  
 @Test
  	
 public void testDijkstraConstructor() {
     
     	CompetitionDijkstra dij = new CompetitionDijkstra("input-I.txt", 60,70,84);
	     assertEquals("constructor failed with valid input", dij.slowSpeed, 60);

	    dij = new CompetitionDijkstra("input-J.txt", 70,60,84);
	     assertEquals("constructor failed with valid input", dij.slowSpeed, 60); 

	     dij = new CompetitionDijkstra("input-J.txt", 90,60,50);
	     assertEquals("constructor failed with valid input", dij.slowSpeed, 50); 
	     
	   
	     
	     
	        
	  
 
  	
 }
  	
  	
 @Test
  	
 public void testDijkstraCompetition() {
     CompetitionDijkstra competitionDijkstra1 = new CompetitionDijkstra("tinyEWD.txt", 50,80,60);
     assertEquals("checking comp with tinyEWD, should be 38, answer is :", 38, competitionDijkstra1.timeRequiredforCompetition()); 
     
  	
 }
  	
  	
 @Test
  	
 public void testDijkstraInvalid() {
  	
     CompetitionDijkstra competitionDijkstra = new CompetitionDijkstra("TINYsdfgdfgEWD.txt", 50, 80, 60);
  	
     assertEquals("checking with wrong filename should be -1, answer :", -1, competitionDijkstra.timeRequiredforCompetition());
     
     CompetitionDijkstra competitionDijkstra1 = new CompetitionDijkstra(null, 50, 80, 60);
   	
     assertEquals("checking with null filename", -1, competitionDijkstra1.timeRequiredforCompetition());
  	
     CompetitionDijkstra competitionDijkstra2 = new CompetitionDijkstra("tinyEWD.txt", -1, 80, 60);
  	
     assertEquals("checking with neg speed should be -1, answer :", -1, competitionDijkstra2.timeRequiredforCompetition());
  	

  	
 }
  	
  
 @Test
 public void testFWConstructor() {

     CompetitionFloydWarshall floyWar = new CompetitionFloydWarshall("input-I.txt", 60,70,84);
     assertEquals("constructor failed with valid input", floyWar.slowSpeed, 60);

     floyWar = new CompetitionFloydWarshall("input-J.txt", 70,60,84);
     assertEquals("constructor failed with valid input", floyWar.slowSpeed, 60); 

     floyWar = new CompetitionFloydWarshall("input-J.txt", 90,60,50);
     assertEquals("constructor failed with valid input", floyWar.slowSpeed, 50); 

     floyWar = new CompetitionFloydWarshall("notARealFile.txt", 70,60,84);
     assertEquals("constructor failed with valid input", floyWar.allowed, false);
     

 }
  	
  	
 @Test
  	
 public void testFWCompetition() {
     CompetitionFloydWarshall competitionFloydWarshall1 = new CompetitionFloydWarshall("tinyEWD.txt", 50,80,60);
     assertEquals("checking comp with tinyEWD, should be 38, answer is :", 38, competitionFloydWarshall1.timeRequiredforCompetition()); 
 }
  	
  	
 @Test
  	
 public void testFWInvalid() {
  	
     CompetitionFloydWarshall competitionFloydWarshall = new CompetitionFloydWarshall("TINYsfssfsdfsEWD.txt", 50, 80, 60);
  	
     assertEquals("checking with wrong filename should be -1, answer :", -1, competitionFloydWarshall.timeRequiredforCompetition());
     
     CompetitionFloydWarshall competitionFloydWarshall1 = new CompetitionFloydWarshall(null, 50, 80, 60);
   	
     assertEquals("checking with null filename", -1, competitionFloydWarshall1.timeRequiredforCompetition());
  	
     CompetitionFloydWarshall competitionFloydWarshall2 = new CompetitionFloydWarshall("tinyEWD.txt", -1, 80, 60);
  	
     assertEquals("checking with neg speed should be -1, answer :", -1, competitionFloydWarshall2.timeRequiredforCompetition());
  	

  	
 }


}
