public class Best_Time_to_Buy_and_Sell_Stack {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i:prices){
            mini = Math.min(mini,i);
            profit = Math.max(profit,(i-mini));
        }
        return profit;
    }
}
