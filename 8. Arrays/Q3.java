/*Q.3 : You  are  given  an  array prices where prices[i] is  the  price  of 
a  given  stock  on  the ith day.
Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0. */

public class Q3 {

    public static int Max_Profit(int[] arr) {
        int buyPrice = arr[0];
        int MaxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            int sellPrice = arr[i];
            buyPrice = Math.min(buyPrice, sellPrice);
            MaxProfit = Math.max((sellPrice - buyPrice), MaxProfit);
        }
        return MaxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println("The Maximum profit is : " + Max_Profit(prices));
    }
}
