package ds.linear.arrayys;// find largest and smallest number in an unsorted array

// -------- Approach 1 : Using Iteration ---------

import java.util.Arrays ;
class Demo
{
	public static void main()
	{
		int[] arr = {2,3,4,6,7,2,0,9,-1} ;
		arr.largestSmallest();
	}

	public static void largestSmallest(int[] arr)
	{
		int largest  = Integer.MIN_VALUE ;
		int smallest = Integer.MAX_VALUE ;

		for(int number : arr)
		{
			if( number > largest)
			{
				largest = number ; 
			}
			else if(number < smallest)
			{
				smallest = number ;
			}
		}

		System.out.println("Largest and Smallest numbers are: " + largest + " : "+ smallest) ;
	}
}

