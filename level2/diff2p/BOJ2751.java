package level2.diff2p;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

// 1296ms >> 개선 필요?

public class BOJ2751 {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        for (int num: list) {
            sb.append(num + "\n");
        }
        System.out.println(sb);
    }
}
