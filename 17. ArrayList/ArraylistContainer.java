import java.util.ArrayList;

public class ArraylistContainer {

    public static int storeWater(ArrayList<Integer> height) { // TC = O(n^2)
        int max = 0;

        // Brute Force
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int CurWater = ht * width;
                if (CurWater > max) {
                    max = CurWater;
                }
            }
        }
        return max;
    }

    public static int OptimisedStoreWater(ArrayList<Integer> height) { // TC : O(n)
        int lp = 0, rp = height.size() - 1;
        int max = 0;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int CurWater = ht * width;
            max = Math.max(max, CurWater); 
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Max Water Contained (Brute Force) : " + storeWater(height));
        System.out.println("Max Water Contained (Optimised) : " + OptimisedStoreWater(height));
    }
}
