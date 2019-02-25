import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2019
 *  
 *  **These values are an average of 3 tests of each algorithm for each respective input data**
 *  
 *  					| Insert (ns)	| Quick (ns)		| MergeRecursive (ns)	| MergeIterative (ns)	|Selection (ns)		|
 *  -----------------------------------------------------------------------------------------------------------------------------
 *  10 Random			|	0.004562	|	0.0034322		|	0.0210974			|	0.0012335				|	0.005702	|	
 *  -----------------------------------------------------------------------------------------------------------------------------
 *  100 Random			|	0.117462	| 	0.043343		|	0.0946532			|	0.1186643				|	0.108339	|	
 *  -----------------------------------------------------------------------------------------------------------------------------
 *  1000 Random			|	12.710116	|	0.243237		|	1.895645			|	0.9772567				|	6.824193	|
 *  -----------------------------------------------------------------------------------------------------------------------------
 *  1000 Few Unique		|	8.379422	|	0.754354		|	0.9148915			|	0.8823453				|	5.608234	|	
 *  -----------------------------------------------------------------------------------------------------------------------------
 *  1000 Nearly Ordered	|	10.123389	|	2.535433		|	0.9627898			|	0.8434453				|	5.288635	|
 *  -----------------------------------------------------------------------------------------------------------------------------
 *  1000 Reverse Order	|	6.572733	|	6.345334		|	1.0089747			|	0.6983433				|	6.918846	|
 *  -----------------------------------------------------------------------------------------------------------------------------
 *  1000 Sorted			|	4.168186	|	7.876555		|	0.9921547			|	0.6437547				|	5.344801	|
 *  
 *  a. Which of the sorting algorithms does the order of input have an impact on? Why?
 *  All of them have some impact but some of them have a larger impact. E.g insertion sort and merge sort can sort 10 random
 *  quick enough but insertion sort takes over 12.710116ns whereas merge recursive can do it in 1.895645ns
 *  
 *  
	b. Which algorithm has the biggest difference between the best and worst performance, based
	on the type of input, for the input of size 1000? Why?
	Insertion sort has the largest difference. it can do the sorted 1000 in 4.168186ns but takes 12.710116ns when it is random, that
	means it takes 3 times longer when its not sorted

	c. Which algorithm has the best/worst scalability, i.e., the difference in performance time
	based on the input size? Please consider only input files with random order for this answer.
	Insertion Sort has the worst scalability, it does the 100 random in 0.117462 which is respectable but it quickly gets worse
	as for where its 1,000 random its all the way up too 12.710116ns
	
	Quick is the best scalability as it sorts 100 random in 0.043343ns and can do 1,000 random in 0.243237ns which is only a small jump
	

	d. Did you observe any difference between iterative and recursive implementations of merge
	sort?
	no,there was very few differences between iterative and  recursive

	e. Which algorithm is the fastest for each of the 7 input files? 
	10 random - merge iterative
	100 random - quick sort
	1000 random - quick sort
	1000 few unique - quick
	1000 nearly ordered - merge iterative
	1000 reverse order - merge iterative
	1000 sorted - merge iterative
 *  
 *  
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
    }
    @Test
    public void testInsertionSort() {
    	double a[] = {56.0}; // test with one value in Array
    	double expectedArray[] = {56.0}; 
    	double sortedArray[] = new double[a.length];
    	sortedArray = SortComparison.insertionSort(a);
    	assertArrayEquals(expectedArray, sortedArray, 0);
    	
    	double b[] = {91.0, 58.0,67.0}; // test with three values in Array
    	double expectedArray1[] = {58.0, 67.0, 91.0};
    	double sortedArray1[] = new double[b.length];
    	sortedArray1 = SortComparison.insertionSort(b);
    	assertArrayEquals(expectedArray1, sortedArray1, 0);
    	
    	double c[] = {5,-10,2}; // testing with both pos and neg numbers
    	double expectedArray11[] = {-10,2,5};
    	double sortedArray11[] = new double[c.length];
    	sortedArray11 = SortComparison.insertionSort(c);
    	assertArrayEquals(expectedArray11, sortedArray11, 0);
    	
    	
    	double d[] = {-10, -70, -4}; // testing with only neg numbers
    	double expectedArray111[] = {-70,-10,-4};
    	double sortedArray111[] = new double[d.length];
    	sortedArray111 = SortComparison.insertionSort(d);
    	assertArrayEquals(expectedArray111, sortedArray111, 0);
    	
    	
    }
    
    @Test
    public void testQuickSort() 
    {
    	double a[] = {56.0}; // test with one value in Array
    	double expectedArray[] = {56.0}; 
    	double sortedArray[] = new double[a.length];
    	sortedArray = SortComparison.quickSort(a);
    	assertArrayEquals(expectedArray, sortedArray, 0);
    	
    	
    	double b[] = {91.0, 58.0,67.0}; // test with three values in Array
    	double expectedArray1[] = {58.0, 67.0, 91.0};
    	double sortedArray1[] = new double[b.length];
    	sortedArray1 = SortComparison.quickSort(b);
    	assertArrayEquals(expectedArray1, sortedArray1, 0);
    	
    	double c[] = {5,-10,2}; // testing with both pos and neg numbers
    	double expectedArray11[] = {-10,2,5};
    	double sortedArray11[] = new double[c.length];
    	sortedArray11 = SortComparison.quickSort(c);
    	assertArrayEquals(expectedArray11, sortedArray11, 0);
    	
    	
    	double d[] = {-10, -70, -4}; // testing with only neg numbers
    	double expectedArray111[] = {-70,-10,-4};
    	double sortedArray111[] = new double[d.length];
    	sortedArray111 = SortComparison.quickSort(d);
    	assertArrayEquals(expectedArray111, sortedArray111, 0);
    	
    	
    }
    
    @Test
    public void testselectionSort() 
    {
    	double a[] = {56.0}; // test with one value in Array
    	double expectedArray[] = {56.0}; 
    	double sortedArray[] = new double[a.length];
    	sortedArray = SortComparison.selectionSort(a);
    	assertArrayEquals(expectedArray, sortedArray, 0);
    	
    	
    	double b[] = {91.0, 58.0,67.0}; // test with three values in Array
    	double expectedArray1[] = {58.0, 67.0, 91.0};
    	double sortedArray1[] = new double[b.length];
    	sortedArray1 = SortComparison.selectionSort(b);
    	assertArrayEquals(expectedArray1, sortedArray1, 0);
    	
    	double c[] = {5,-10,2}; // testing with both pos and neg numbers
    	double expectedArray11[] = {-10,2,5};
    	double sortedArray11[] = new double[c.length];
    	sortedArray11 = SortComparison.selectionSort(c);
    	assertArrayEquals(expectedArray11, sortedArray11, 0);
    	
    	
    	double d[] = {-10, -70, -4}; // testing with only neg numbers
    	double expectedArray111[] = {-70,-10,-4};
    	double sortedArray111[] = new double[d.length];
    	sortedArray111 = SortComparison.selectionSort(d);
    	assertArrayEquals(expectedArray111, sortedArray111, 0);
    	
    	
    }
    
    @Test
    public void testMergesortrecursive() 
    {
    	double a[] = {56.0}; // test with one value in Array
    	double expectedArray[] = {56.0}; 
    	double sortedArray[] = new double[a.length];
    	sortedArray = SortComparison.mergeSortRecursive(a);
    	assertArrayEquals(expectedArray, sortedArray, 0);
    	
    	
    	double b[] = {91.0, 58.0,67.0}; // test with three values in Array
    	double expectedArray1[] = {58.0, 67.0, 91.0};
    	double sortedArray1[] = new double[b.length];
    	sortedArray1 = SortComparison.mergeSortRecursive(b);
    	assertArrayEquals(expectedArray1, sortedArray1, 0);
    	
    	double c[] = {5,-10,2}; // testing with both pos and neg numbers
    	double expectedArray11[] = {-10,2,5};
    	double sortedArray11[] = new double[c.length];
    	sortedArray11 = SortComparison.mergeSortRecursive(c);
    	assertArrayEquals(expectedArray11, sortedArray11, 0);
    	
    	
    	double d[] = {-10, -70, -4}; // testing with only neg numbers
    	double expectedArray111[] = {-70,-10,-4};
    	double sortedArray111[] = new double[d.length];
    	sortedArray111 = SortComparison.mergeSortRecursive(d);
    	assertArrayEquals(expectedArray111, sortedArray111, 0);
    	
    	
    }
    
    @Test
    public void testMergesortIterative() 
    {
    	double a[] = {56.0}; // test with one value in Array
    	double expectedArray[] = {56.0}; 
    	double sortedArray[] = new double[a.length];
    	sortedArray = SortComparison.mergeSortIterative(a);
    	assertArrayEquals(expectedArray, sortedArray, 0);
    	
    	
    	double b[] = {91.0, 58.0,67.0}; // test with three values in Array
    	double expectedArray1[] = {58.0, 67.0, 91.0};
    	double sortedArray1[] = new double[b.length];
    	sortedArray1 = SortComparison.mergeSortIterative(b);
    	assertArrayEquals(expectedArray1, sortedArray1, 0);
    	
    	double c[] = {5,-10,2}; // testing with both pos and neg numbers
    	double expectedArray11[] = {-10,2,5};
    	double sortedArray11[] = new double[c.length];
    	sortedArray11 = SortComparison.mergeSortIterative(c);
    	assertArrayEquals(expectedArray11, sortedArray11, 0);
    	
    	
    	double d[] = {-10, -70, -4}; // testing with only neg numbers
    	double expectedArray111[] = {-70,-10,-4};
    	double sortedArray111[] = new double[d.length];
    	sortedArray111 = SortComparison.mergeSortIterative(d);
    	assertArrayEquals(expectedArray111, sortedArray111, 0);
    	
    	
    }




    // TODO: add more tests here. Each line of code and ech decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        //TODO: implement this method
    }

}