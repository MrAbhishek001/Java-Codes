public class ShortestPath {

    public static float Shortest_Path(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // Direction Formula
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest path = " + Shortest_Path(path));
        ;
    }
}
