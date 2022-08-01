package level2.diff2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11050 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums[] = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int k = Integer.parseInt(nums[1]);

        int son = 1;
        int mom1 = 1;
        int mom2 = 1;

        for (int i = 1; i <= n; i++)
            son *= i;
        for (int i = 1; i <= k; i++)
            mom1 *= i;
        for (int i = n-k; i > 0; i--)
            mom2 *= i;

        System.out.println(son / (mom1 * mom2));




    }
}
