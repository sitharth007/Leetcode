class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max_pro = 0;
        int n = prices.length;
        int buy = prices[0];
        for(int i=1;i<n;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else if(prices[i] > buy){
                profit = buy - prices[i];
                max_pro += profit; 
                buy = prices[i];
            }
        }
        return (-1)*max_pro;
    }
}