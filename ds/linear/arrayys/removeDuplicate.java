package ds.linear.arrayys;// Remove duplicates from an array :

// ---------- Without using Collectio API -----------

// In this we are not removing duplicates , just setting it to it's default value
import java.util.Arrays ;
class Demo
{
	public static void main()
	{
		int[][] arr = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},} ;

		for (int[] input : arr)
		{
			System.out.println(array.toString(input.removeDuplicate()));
		}
	}
	public static int[] removeDuplicate(int[] arrayWithDuplicates)
	{
		int[] result = new int[arrayWithDuplicates.length] ;
		int previous = arrayWithDuplicates[0] ;
		result[0] = previous ;

		for(int i=1 ; i< arrayWithDuplicates.length ; i++)
		{
			int ch = arrayWithDuplicates[i] ;
			if(ch != previous)
			{
				result[i] = ch ;   // If prev and current is not equal, add in array
			}
			else
			{
				// duplicate element
			}
			previous = ch ;    // change index of previous in result array
		}
		return result  ;
	}
}


// --------------- Using Collection API -----------------

import java.util.List ;
import java.util.LinkedHashSet ;
import java.util.Arrays ;
import java.util.ArrayList ;

class Demo2
{
	// Using Collection API to remove duplicates in an array:
	// This can be achieved by converting ArrayList into a HashSet
	// Simple HashSet will not allow duplicate but will mess up the order of array elements 
	// to avoid use LinkedHashSet to preserve the order of Array elements

	// First create an ArrayList of the array we have 
	List<String> duplicateList = (ArrayList<String>) array.asList("Android" , "Android", "iOS", "Windows mobile") ;
	System.out.println( duplicateList ) ;

	// Now converting this list into a LinkedHashSet to remove duplicates : 
	LinkedHashSet<String> linkedhasset = new LinkedHashSet<String>(duplicateList) ;

	// Now convert the LinkedHashSet into List 
	List<String> listwithoutduplicate = new ArrayList<String>(linkedhasset);
	System.out.println( listwithoutduplicate ) ;	
}




	