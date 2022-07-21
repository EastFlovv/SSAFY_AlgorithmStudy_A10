package level2.diff2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int check = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < check; i++) {
            boolean bool = true;
            int cur = Integer.parseInt(st.nextToken());
            for (int x: arr) {
                if(x == cur){
                    sb.append("1\n");
                    bool = false;
                    break;
                }
            }
            if (bool) sb.append("0\n");
//            System.out.println(ans);
        }
        System.out.println(sb);
    }
}
