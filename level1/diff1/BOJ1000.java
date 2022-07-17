package level1.diff1;

import java.io.*;
import java.util.*;

public class BOJ1000 {
    public static void main(String[] args) throws IOException {
//        bufferedReader 선언
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
//        stringTokenizer 사용
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a + b);
    }
}
