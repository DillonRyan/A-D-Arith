import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2019
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[]){
    	double temp ;
    	for(int i = 0; i < a.length; i++) {
    		for(int j = i; j > 0; j--) {
    			if(a[j] < a[j-1]) {
    				temp = a[j];
    				a[j] = a[j - 1];
    				a[j-1] = temp;
    			}
    		}
    	
    	}
    	return a;
        //todo: implement the sort
    }//end insertionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[]){
    	int low = 0;
    	int high = a.length-1;
    	quickSortFunction(a,low, high);
		return a;
	
		 //todo: implement the sort

    }//end quicksort
    
    private static void quickSortFunction(double a[], int low, int high) { 
    	int midArray = low + (high - low) / 2;
    	double pivot = a[midArray];
    	int tempHigh = high;
    	int templow = low;
    	
    	if(low >= high) {
    		return;
    	}
    	while (templow <= tempHigh) {
    		while(a[templow] < pivot) {
    			low++;
    		}
    		while(a[tempHigh] > pivot) {
    			tempHigh--;
    		}
    		if(low <= tempHigh) {
    			double temp = a[templow];
    			a[templow] = a[tempHigh];
    			a[tempHigh] = temp;
    			templow++;
    			tempHigh--;
    			
    			
    			
    		}
    	}
    	if(high > templow) {
    		quickSortFunction(a, templow, high);
    	}
    }
    	
    
    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double a[]) {
    	
       int size = a.length - 1;
        for (int i = 1; i <= size;  i = 2*i) // size
        { 
         
            for (int j = 0; j < size; j += 2*i) // left 
            { 
             
                int middle = j + i - 1; 
          
                int right = Math.min(j + 2*i - 1, size);
                int left = j;
                merge(a, left, middle, right); 
            } 
        } 
        return a;
		 //todo: implement the sort
	
    }//end mergesortIterative
    
    static void merge(double a[], double left, double middle, double right) 
    { 
        double n1 = middle - left + 1; 
        double n2 = right - middle; 
        double Left[] = new double[(int) n1]; 
        double Right[] = new double[(int) n2]; 
      
        for (int i = 0; i < n1; i++) 
            Left[(int) i] = a[(int) (left + i)]; 
        for (int j = 0; j < n2; j++) 
            Right[(int)j] = a[(int) (middle + 1+ j)]; 
      
        int i = 0; 
        int j = 0; 
        int p = (int)left; 
        while (i < n1 && j < n2) 
        { 
            if (Left[i] <= Right[j]) 
            {
                a[p] = Left[i]; 
                i++; 
            } 
            else
            { 
                a[p] = Right[j]; 
                j++; 
            } 
            p++; 
        } 
      
        while (i < n1) 
        { 
            a[p] = Left[i]; 
            i++; 
            p++; 
        } 

        while (j < n2) 
        { 
            a[p] = Right[j]; 
            j++; 
            p++; 
        } 
    } 
    
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {
    	int size = a.length;
         if(size > 1) 
         { 
             int middle = size / 2; 
             double[] left = new double[middle]; 
             double[] right = new double[size - middle]; 
             for(int i = 0; i < middle; i++) 
             { 
                 left[i] = a[i]; 
             } 
             for(int i = middle; i < size; i++) 
             { 
                 right[i - middle] = a[i]; 
             } 
             mergeSortRecursive(left); 
             mergeSortRecursive(right); 
   
             int i = 0; 
             int j = 0; 
             int k = 0; 
   
             while(i < left.length && j < right.length) 
             { 
                 if(left[i] < right[j]) 
                 { 
                     a[k] = left[i]; 
                     i++; 
                 } 
                 else
                 { 
                     a[k] = right[j]; 
                     j++; 
                 } 
                 k++; 
             } 
             while(i < left.length) 
             { 
                 a[k] = left[i]; 
                 i++; 
                 k++; 
             } 
             while(j < right.length) 
             { 
                 a[k] = right[j]; 
                 j++; 
                 k++; 
             } 
         } 
    	return a;

    	//todo: implement the sort
	
   }//end mergeSortRecursive
    	
    
    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){
    	int tmp;
    	for (int i = 0; i < a.length-1; i++)
    	{
    	int min_idx = i;
    	for (int j = i+1; j < a.length; j++)
    	if (a[j] < a[min_idx])
    	min_idx = j;
    
    	double temp = a[min_idx];
    	a[min_idx] = a[i];
    	a[i] = temp;
    	}
    	return a;

         //todo: implement the sort

    }//end selectionsort

   


    public static void main(String[] args) {
    	/*
    	ArrayList<Double> arrayList1 =new ArrayList<Double>();
    	Scanner fileScanner;
    	String [] files = {"numbers10.txt", "numbers100.txt", "numbers1000.txt", "numbers1000Duplicates.txt", "numbersNearlyOrdered1000.txt", "numbersReverse1000.txt", "numbersSorted1000.txt"};
   		File file = new File(files[0]);
   		try {
   			fileScanner = new Scanner(file);

   			while (fileScanner.hasNextDouble()) 
   			{
   				arrayList1.add(fileScanner.nextDouble());
   			}

   		} catch (Exception e) {
   			e.printStackTrace();
   		}
   		
   		double[] inputArray = new double[arrayList1.size()] ;
   		
   		for(int i =0; i < arrayList1.size(); i++ )
   		{
   			inputArray[i] = arrayList1.get(i);
   		}
   		
   		int a = 0;
   		double startTime;
   		double endTime;
   		double finalTime;
   		
   		switch(a)
   		{
   		
   			case 1:
   				startTime = System.nanoTime();
   				SortComparison.insertionSort(inputArray);
   				endTime = System.nanoTime();
   				finalTime = (endTime - startTime) / 1000000;
   				print(inputArray);
   				System.out.println("Insertion sort time : " + finalTime);
   				break;
   				
   			case 2:
   				startTime = System.nanoTime();
   				SortComparison.quickSort(inputArray);
   				endTime = System.nanoTime();
   				finalTime = (endTime - startTime) / 1000000;
   				print(inputArray);
   				System.out.println("Quick sort time : " + finalTime);
   				break;
   				
   			case 3:
   				startTime = System.nanoTime();
   				SortComparison.mergeSortRecursive(inputArray);
   				endTime = System.nanoTime();
   				finalTime = (endTime - startTime) / 1000000;
   				print(inputArray);
   				System.out.println("Merge Sort Recursive sort time : " + finalTime);
   				break;
   			
   			case 4:
   				startTime = System.nanoTime();
   				SortComparison.mergeSortIterative(inputArray);
   				endTime = System.nanoTime();
   				finalTime = (endTime - startTime) / 1000000;
   				print(inputArray);
   				System.out.println("Merge Sort Iterative time : " + finalTime);
   				break;	
   				
   			case 5:
   				startTime = System.nanoTime();
   				SortComparison.selectionSort(inputArray);
   				endTime = System.nanoTime();
   				finalTime = (endTime - startTime) / 1000000;
   				print(inputArray);
   				System.out.println("Selection sort time : " + finalTime);
   				break;
   		}
   		}
   		
   	
    
    public static void print(double[] printArray)
    {
    	
    	for(int i = 0; i< printArray.length; i++)
    	{
    		System.out.println(printArray[i]);
    	}
    	*/
    }
        //todo: do experiments as per assignment instructions
    

 }//end class
