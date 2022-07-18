package level1.diff1;

import java.io.*;

public class BOJ2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < 9; i++){
            int cur = Integer.parseInt(br.readLine());
            if(cur > ans) {
                ans = cur;
                cnt = i + 1;
            }
        }
        System.out.println(ans);
        System.out.println(cnt);
    }
}
