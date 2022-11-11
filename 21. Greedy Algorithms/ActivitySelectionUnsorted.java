import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionUnsorted {
    public static void main(String[] args) {
        int[] start = { 5, 8, 5, 1, 3, 0 };
        int[] end = { 7, 9, 9, 2, 4, 6 };

        int[][] activities = new int[start.length][3];

        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Sorting 2D Arrray Using Lambda Expression
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int count = 1;
        int chosen_Ac = 0;

        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= activities[chosen_Ac][2]) {
                count++;
                chosen_Ac = i;
            }
        }

        System.out.println(count);
    }
}
