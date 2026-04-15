package ds.linear.arrayys;// Two Sum Optimized
import java.util.* ;
// Only single pair in array exists whose sum is equal to given target number 
class TwoSumOptimized
{
	public int[] twoSum(int[] arr, int target)
	{
		int[] result = new int[2];
		Map<Integer , Integer> map = new HashMap<>() ;
		for(int i =0 ; i < arr.length ; i++)
		{
			if(map.containsKey(target - arr[i]))
			{
				result[1] = i ;
				result[0] = map.get(target - arr[i]) ;
			}
			map.put(arr[i] , i);
		}
		return  result ;
	}
}

class TwoSumOptimizedRunner
{
	public static void main(String[] args)
	{
		int[] arr = {2,4,3,1,4,7,9} ;
		int target = 9 ;
		TwoSumOptimized tso = new TwoSumOptimized() ;
		int[] sop = tso.twoSum(arr, 9) ;
		System.out.print("Indices are : ") ;
		for(int n : sop)
			System.out.print(n + " ") ;
	}
}