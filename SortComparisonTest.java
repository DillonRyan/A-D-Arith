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
