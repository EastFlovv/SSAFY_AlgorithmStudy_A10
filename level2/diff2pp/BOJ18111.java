package level2.diff2pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String[] info = br.readLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int m = Integer.parseInt(info[1]);
        int[] arr = new int[n * m];

        for (int i = 0; i < n; i++) {
            sb.append(br.readLine()).append(i + 1 == n ? "" : " ");
        }
        st = new StringTokenizer(sb.toString());

        int maxLevel = -1;
        int minLevel = 257;
        for (int i = 0; i < n * m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            minLevel = Math.min(minLevel, arr[i]);
            maxLevel = Math.max(maxLevel, arr[i]);
        }

        int time = Integer.MAX_VALUE;
        int level = 0;
        for (int i = minLevel; i <= maxLevel; i++) {
            int inventory = Integer.parseInt(info[2]);
            int curTime = 0;
            for (int block : arr) {
                if (block < i){
                    curTime += i - block;
                    inventory -= (i - block);
                }else if(block > i) {
                    curTime += (block - i) * 2;
                    inventory += (block - i);
                }
            }
            if(inventory < 0) continue;
            if(curTime <= time){
                time = curTime;
                level = i;
            }

        }

        System.out.println(time + " " + level);

    }
}
