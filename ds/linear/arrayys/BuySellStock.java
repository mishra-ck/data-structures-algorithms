package ds.linear.arrayys;// Best Time to Buy and Sell Stock

// This class will find the right time to sell stock in a week to gain max profit
// Time Complexity 
class BuySellStock
{
	public int buySellStock(int[] stock_arr)
	{
		int sell_day = 0;  // considering monday as day 1 of the week
		int max_amt = 0 ;
		for(int i = 0 ; i < stock_arr.length - 1; i++)
		{
			for(int j = 0 ; j < stock_arr.length ; j++)
			{
				if((stock_arr[i] -stock_arr[j]) > (max_amt))
				{	max_amt = stock_arr[i] -stock_arr[j] ;
					sell_day = j;
				}
			}
		}
		return sell_day ; 
	}
}
class BuySellRunner
{
	public static void main(String[] args)
	{
		int[] stock = { 4,2,2,5,1,3} ;
		BuySellStock sell = new BuySellStock() ;
		System.out.print("Best time to sell stock is : " + sell.buySellStock(stock));
	}
}