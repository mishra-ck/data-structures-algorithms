package ds.linear.arrayys;

// Two sum problem : Brute force approach
// Time complexity is O(n^2)
class TwoSum
{
	public int[] twoSum(int[] arr, int target)
	{
		int[] result = new int[arr.length];
		for(int i=0;i<= arr.length-1 ; i++)
		{
			for(int j=0;j<= arr.length-1 ; j++)
			{
				if( (arr[i]+ arr[j]) == target)
				{
					result[i]   = arr[i];
					result[j] = arr[j] ;
				}
			}
		}
		return result ;
	}
}

class TwoSumRun
{
	public static void display(int[] arr)
	{
		for(int n : arr)
		{
			System.out.print(n + " ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {1,-1,0,3,5,9,7} ;
		int target = 8 ;
		TwoSum sum = new TwoSum() ;
		display(sum.twoSum(arr, 8));
		
	}
}
// Output :
//  1 -1 0 3 5 9 7


