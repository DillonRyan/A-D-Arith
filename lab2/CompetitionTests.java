import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
     assertEquals("constructor failed with valid input", floyWar.slowSpeed, 60); // 60 to 0

     floyWar = new CompetitionFloydWarshall("input-J.txt", 70,60,84);
     assertEquals("constructor failed with valid input", floyWar.slowSpeed, 60); // 60 to 0

     floyWar = new CompetitionFloydWarshall("input-J.txt", 90,60,50);
     assertEquals("constructor failed with valid input", floyWar.slowSpeed, 50); // 50 to 0

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
