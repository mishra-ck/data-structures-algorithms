// we have to find first repeating element in an array 

// ------Approach1 : Brute force ----------

public static int firstRepeat(int[] arr)
{
	int size = arr.length-1 ;
	for(int i = 0 ; i< size ; i++)
	{
		for(int j = i ; j < size ; j++)
		{
			if(arr[i] == arr[j])
			{
				return arr[i] ;
			}
			else
			{
				return -1 ;
			}
		}
	}
}


// ---------- Approach2 : Optimized solution -----------

// LinkedHashSet does not allow insertion of duplicates
// as well as maintains the insertion order

public static void firstRepeatUsingSet(int[] arr)
{
	Set<> set = new LinkedHashSet<>() ;

	for(int num = 0 ; num < arr.length num++)
	{
		if( !set.contains(num[i]))
		{
			set.add(num[i]) ;
 		}
 		else
 		{
 			System.out.printf( " repeated element are :" + num[i] + " and is present at index " + i );
 		}
	}
}


