package org.example;

//Problem -121
public class BuySellStock {
    public static void main(String[] args) {
        int[] a= {7,2,5,3,1};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] prices) {
        int profit =0; int buy = prices[0];
        for(int i=1;i<prices.length;i++) {
            if((prices[i]-buy) < 0) {
                buy= prices[i];
            } else if(profit< prices[i]-buy){
                profit = prices[i]-buy;
            }
        }
        return profit;
    }
}
