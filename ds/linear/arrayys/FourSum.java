package ds.linear.arrayys;// Four Sum : sum of 4 elements of an array equal to target number
// The idea is to use 2 loops and two other pointers from front and last respectiverly to traverse and find the sum 
import java.util.Arrays ;
class FourSumDemo
{
	public ArrayList fourSum(int[] arr , int taregt)
	{
		int n = arr.length-1 ;
		ArrayList<List<Integer>> list = new ArrayList<List<>>();

		if(arr == null || arr.length ==0)
			return list ;

		array.sort(arr) ;   // sort the array
		
		for(int i =0 ; i< n ; i++)
		{
			for(int j = i+1 ; j< n ; j++)
			{
				int front = j+1 ;
				int last  = n-1 ;
				
				int target2 = target - arr[i] + arr[j];
				while(last > front)
				{
					int two_sum = arr[last] + arr[front] ;
					
					if(two_sum < target2 )    
						front++ ;
					else if(two_sum > target2)
						last-- ;
					else
					{
						List<integer>  quad = new List<>() ;
						quad.add(arr[i]) ;
						quad.add(arr[j]) ;
						quad.add(arr[front]) ;
						quad.add(arr[last]) ;
						res.add(quad) ;
						
						//Processing duplicates for front and last pointers
						while(last > front && arr[front] == quad.get[2])
							++front ;
						while(last > front && arr[last] == quad.get[3])
							--last ;
					}
				}
				// Processing duplicate in case of j : j is less than n and next element is same
				while( j+1 < n  && arr[j] == arr[j+1])
					++j ;	
			}
			// Processing duplicate in case of i : i is less than n and next element is same
			while( i+1 < n  && arr[i] == arr[i+1])
				++i;
		}
	}
}
