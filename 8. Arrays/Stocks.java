public class Stocks {

    public static int Profit(int[] arr) {
        int buyPrice = arr[0];
        int sellPrice = arr[1];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            sellPrice = arr[i];
            buyPrice = Math.min(buyPrice, sellPrice);
            profit = Math.max(sellPrice - buyPrice, profit);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("The Maximum Profit is : " + Profit(prices));
        ;
    }
}
