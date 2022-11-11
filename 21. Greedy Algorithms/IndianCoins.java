import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer[] denominations = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(denominations, Comparator.reverseOrder());
        int amount = 590;
        int coins = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < denominations.length; i++) {
            if (denominations[i] <= amount) {
                while (denominations[i] <= amount) {
                    coins++;
                    ans.add(denominations[i]);
                    amount -= denominations[i];
                }
            }
        }

        System.out.println("Total no. of Coins : " + coins);
        System.out.println("Coins Used : " + ans);
    }
}
