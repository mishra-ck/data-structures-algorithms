// Find the k-th smallest and largest element in an array 

// logic is to sort the given array and then the desired element from the given position 
// considering there may not  be any duplicates elements

import java.util.Arrays ;
public static int kthLargestSmallest( int[] arr , int k , String str )
{
	String largest  ;
	int size = arr.length  ;
	// Sorting the array given 
	Arrays.sort(arr) ;

	if(largest.equals(str.toLowerCase()))   
	{
		return arr[size - k ] ;		// for k-largest element
	}
	else
	{
		return arr[size - k ] ;		// for k-smallest element
	}

}




