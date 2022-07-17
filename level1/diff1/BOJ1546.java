package level1.diff1;

import java.util.*;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxScore = 0;
        double ans = 0;
        int tests = scan.nextInt();
        int[] scores = new int[tests];

        for (int i = 0; i < tests; i++){
            int score = scan.nextInt();
            scores[i] = score;
            maxScore = Math.max(maxScore, score);
        }

        for (int i = 0; i < tests; i++){
            ans += (double)scores[i] / maxScore * 100;
        }

        System.out.println(ans/tests);
    }
}
