public class RainwaterTrapping {

    public static int Water_Trapped(int[] arr) {
        // Calculate Left max Array
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        // Calculate RightMax Array
        int[] RightMax = new int[arr.length];
        RightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            RightMax[i] = Math.max(RightMax[i + 1], arr[i]);
        }
        // loop
        int TrappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(leftMax[i], RightMax[i]);
            TrappedWater += (waterLevel - arr[i]);
        }
        return TrappedWater;
    }

    public static void main(String[] args) {
        int[] Heights = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Total trapped water is : " + Water_Trapped(Heights));
    }
}
