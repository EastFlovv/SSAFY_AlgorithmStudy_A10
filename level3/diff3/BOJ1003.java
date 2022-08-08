package level3.diff3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cases = Integer.parseInt(br.readLine());

        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = 1;
        zero[1] = 0;
        one[0]= 0;
        one[1]= 1;

        for (int i = 2; i < zero.length; i++) {
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }

//        init

        for (int i = 0; i < cases; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(zero[num]).append(" ").append(one[num]).append("\n");
        }
        System.out.println(sb);
    }
}
