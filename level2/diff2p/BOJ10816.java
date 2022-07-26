package level2.diff2p;

import java.io.*;
import java.util.*;

public interface BOJ10816 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < loop; i++) {
            String curNum = st.nextToken();
            map.put(curNum, map.getOrDefault(curNum, 0) + 1);
        }

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            String curKey = st.nextToken();
            arr[i] = map.getOrDefault(curKey, 0);
        }
        StringBuilder sb = new StringBuilder();

        for (int value : arr) {
            sb.append(value + " ");
        }

        System.out.println(sb);

    }
}
