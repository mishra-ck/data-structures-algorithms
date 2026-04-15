// reverse an array using in-place solution 
// we need to reverse array elements without using another array 

public static void reverseArray( int[] arr )
{
	int start = 0 ;
	int last = arr.length -1 ;

	while( last > start )
	{
		int temp = arr[start] ;
		arr[start] = arr[last] ;
		arr[last] = temp ;

		start++ ;
		last-- ;
	}
	
}