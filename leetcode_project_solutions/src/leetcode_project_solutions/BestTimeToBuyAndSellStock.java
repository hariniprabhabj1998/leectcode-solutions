package leetcode_project_solutions;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		
		int[] price = new int[] {7,1,5,3,6,4};
		BestTimeToBuyAndSellStock stockprob = new BestTimeToBuyAndSellStock();
		System.out.println(stockprob.maxProfit(price));
	}

	public int maxProfit(int[] prices) {
		int min = prices[0];
		int profit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}

			profit = Math.max(profit, prices[i] - min);
		}

		return profit;

	}
}

//check the min and the profit in one go...
//Time complexity is O(n)
