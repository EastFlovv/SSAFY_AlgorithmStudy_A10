package level2.diff2p;

import java.io.*;
import java.util.*;

public class BOJ2164 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int tmp = 1;
        while(tmp < size)
            tmp *= 2;

        System.out.println(size < 3 ? size : (size - tmp / 2) * 2);

    }
}
