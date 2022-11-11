public class ContainerWater {
    public static void main(String[] args) {
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int height = Math.min(heights[j], heights[i]);
                int width = j - i;
                if ((height * width) > max) {
                    max = height * width;
                }
            }
        }
        System.out.println(max);
    }
}
