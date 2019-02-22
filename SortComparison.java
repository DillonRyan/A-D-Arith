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
    
    private static void quickSortFunction(double a[], int low, int high) { //cng
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
    	if(low < tempHigh ) {
    		quickSortFunction(a, low, tempHigh );
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
    	
        int size;  
        int left_start; 
       
        for (size = 1; size <= a.length-1;  size = 2*size) 
        { 
         
            for (left_start = 0; left_start < a.length-1; left_start += 2*size) 
            { 
             
                int mid = left_start + size - 1; 
          
                int right_end = Math.min(left_start + 2*size - 1, a.length-1); 
                merge(a, left_start, mid, right_end); 
            } 
        } 
        return a;
		 //todo: implement the sort
	
    }//end mergesortIterative
    
    static void merge(double a[], double l, double m, double r) 
    { 
        int i, j, k; 
        double n1 = m - l + 1; 
        double n2 = r - m; 
        double L[] = new double[(int) n1]; 
        double R[] = new double[(int) n2]; 
      
        for (i = 0; i < n1; i++) 
            L[(int) i] = a[(int) (l + i)]; 
        for (j = 0; j < n2; j++) 
            R[(int)j] = a[(int) (m + 1+ j)]; 
      
        i = 0; 
        j = 0; 
        k = (int)l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                a[k] = L[i]; 
                i++; 
            } 
            else
            { 
                a[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
      
        while (i < n1) 
        { 
            a[k] = L[i]; 
            i++; 
            k++; 
        } 

        while (j < n2) 
        { 
            a[k] = R[j]; 
            j++; 
            k++; 
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
         if(a.length > 1) 
         { 
             int mid = a.length / 2; 
             double[] left = new double[mid]; 
             double[] right = new double[a.length - mid]; 
             for(int i = 0; i < mid; i++) 
             { 
                 left[i] = a[i]; 
             } 
             for(int i = mid; i < a.length; i++) 
             { 
                 right[i - mid] = a[i]; 
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

        //todo: do experiments as per assignment instructions
    }

 }//end class
