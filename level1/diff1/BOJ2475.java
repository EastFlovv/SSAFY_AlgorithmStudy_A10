package level1.diff1;

import java.io.*;

public class BOJ2475 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] originalCode = br.readLine().split(" ");
        int tmp = 0;
        for (String x: originalCode) {
            tmp += Math.pow(Integer.parseInt(x), 2);
        }
        System.out.println(tmp % 10);
    }
}
