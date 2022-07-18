package level1.diff1;

import java.io.*;

public class BOJ2577 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numsArr = new int[10];
        int num = 1;
        for (int i = 0; i < 3; i++){
            num *= Integer.parseInt(br.readLine());
        }

        while(num > 0){
            numsArr[num % 10]++;
            num = (int)(num / 10);
        }

        for (int i = 0; i < 10; i++){
            System.out.println(numsArr[i]);
        }
    }
}
