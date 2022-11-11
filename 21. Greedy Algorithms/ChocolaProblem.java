import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        Integer[] costVer = { 2, 1, 3, 1, 4 };
        Integer[] costHor = { 4, 1, 2 };

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // Cut to be accomplished
        int hp = 1, vp = 1; // Number of horizontal and vertical pieces
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { // Horizontal Cost
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost of Cuts : " + cost);
    }
}
