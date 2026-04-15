package ds.linear.arrayys;
// find the pair of Intergers whose sum is equal to a number
// Only one pair is present in the array whose sum is equal to target and 
// same number should not part of a pair
// reverse pair is not in scope.

// ------------- Approach1 : Brute Force --------------
// use two loops to iterate and find sum then

public static void findIntegerPair(int[] arr , int target)
{
	if(arr.length <2)
	{
		return ;
	}
	for(int a =0 ; a< arr.length ; a++)
	{
		int first = arr[a] ;
		for(int b = 0 ; b < arr.length ; b++)
		{
			int second = arr[b] ;

			if( first + second == target )
			{
				System.out.println("Integer pair is :  (" + first + "," + second + ")") ;
			}
		}
	}
}


// -------------- Approach2 : Optimized way by using Set ----------------

public static void printPairUsingSet(int[] arr, int sum )
{
	if(arr.length < 2)
	{
		return ;
	}

	Set set = new HashSet() ;

	for(int value : arr)
	{
		int target = sum - value ;
		if(!set.contains( target))
		{
			set.add(value);
		}
		else
		{
			System.out.println("Integer Pair is : "+ value + "," + target) ;
		}
	}
}


// ------------ Approach3 : Using Two pointer after sorting array -------------

// In this approach we will use in-place solution i.e. space complexity will be O(1)

import java.util.Arrays ;
public static void printPairByTwoPointer(int[] arr , int target)
{
	if(arr.length < 2)
	{
		return ;
	}
	Arrays.sort(arr) ;  // sort the first then apply two pointers 

	int first = 0 ;
	int last = arr.length-1 ;
	while( first < last)
	{
		int sum = arr[first] + arr[last] ;
		if( sum == target)
		{
			System.out.println(" Integer pair is : " + first + "," + last) ;
			first = first + 1 ;
			last = last - 1 ;
		}
		else if( sum > target )
		{
			System.out.println(" Sum is grater than target ") ;
			last = last -1 ;
		}
		else
		{
			System.out.println(" Sum is less than target ") ;
			first = first + 1 ;
		}
	}
}



