package level2.diff2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int len = Integer.parseInt(input[0]);
        boolean[] arr = new boolean[len];
        int sep = Integer.parseInt(input[1]);

        int cnt = 0;
        int cur = -1;
        while(cnt < len){
            if((cur + sep) % len)
        }

    }
}
