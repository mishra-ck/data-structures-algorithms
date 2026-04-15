//  How to find top two numbers from an integer array without sorting?
// assuming only +ve numbers are in scope 

public static void findTopTwoElements(int[] arr)
{
	int top = 0 ;
	int lessthantop  = 0 ;

	for(int i = 0 ; i < arr.length-1 ; i++)
	{
		lessthantop = arr[i] ;
		top = arr[++i] ;

		if(top < lessthantop)
		{
			int temp =top ;
			top =  lessthantop ;
			lessthantop = temp ;
		}
		else
		{
			int temp =top ;
			top =  lessthantop ;
			lessthantop = temp ;

		}
	}
}



