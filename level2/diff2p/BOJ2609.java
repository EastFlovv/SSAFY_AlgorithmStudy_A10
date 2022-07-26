package level2.diff2p;

import java.io.*;

public class BOJ2609 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);

        if (a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }

        int a2 = a;
        int b2 = b;
//        유클리드 호제법 사용
        int gcd = 0;
        while (true){
            int x = b2 % a2;
            if(x == 0){
                gcd = a2;
                break;
            }else{
                b2 = a2;
                a2 = x;
            }
        }

        int lcm = a / gcd * b/gcd * gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}
