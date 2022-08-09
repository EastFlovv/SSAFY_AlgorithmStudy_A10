package level3.diff3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cur = 5;
        int result = 0;
        while (cur <= num){
            int curTmp = cur;
            while (curTmp % 5 == 0){
                curTmp /= 5;
                result++;
            }
            cur+=5;
        }
        System.out.println(result);
    }
}
