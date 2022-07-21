package level2.diff2p;

import java.io.*;

// 런타임 에러?

public class BOJ2751_FAIL {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
        String str = "";

        int loop = Integer.parseInt(br.readLine());
        int[] arr = new int[loop];

        for (int i = 0; i < loop; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[(x-1)] = x;
        }

        for (int x: arr) {
            str += x + "\n";
        }

        System.out.println(str);
    }
}
