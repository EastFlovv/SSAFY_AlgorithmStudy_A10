package level1.diff1;

import java.io.*;

public class BOJ2739 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %d\n", num, i, num * i);
            }
    }
}
