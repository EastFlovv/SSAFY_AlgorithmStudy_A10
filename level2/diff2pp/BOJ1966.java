package level2.diff2pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int tcs = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < tcs; tc++) {
            int[] exArr = new int[10];
            Queue<Integer> que = new LinkedList<Integer>();
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int curIdx = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int maxImportant = 0;
            for (int i = 0; i < size; i++) {
                int important = Integer.parseInt(st.nextToken());
                maxImportant = Math.max(maxImportant, important);
                que.offer(important);
                exArr[important]++;
            }

            int result = 0;
            while (true){
                if(que.peek() == maxImportant) {
                    que.poll();
                    exArr[maxImportant] -= 1;
                    result++;
                    if(curIdx == 0) break;
                }else que.offer(que.poll());

                curIdx = curIdx == 0 ? que.size() - 1 : curIdx-1;

                if(exArr[maxImportant] == 0){
                    while (exArr[maxImportant] == 0) maxImportant--;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
