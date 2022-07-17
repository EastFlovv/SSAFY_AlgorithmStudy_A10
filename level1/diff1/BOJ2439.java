package level1.diff1;

import java.util.*;

public class BOJ2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] starArr = new String[size];
        Arrays.fill(starArr, " ");

        for (int i = size-1; i >= 0; i--){
            starArr[i] = "*";
            System.out.println(String.join("", starArr));
        }
    }
}
