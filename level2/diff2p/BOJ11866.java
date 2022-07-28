package level2.diff2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int len = Integer.parseInt(input[0]);
        int sep = Integer.parseInt(input[1]);

        boolean[] arr = new boolean[len];

        ArrayList<String> list = new ArrayList<String>();

        int cnt = 0;
        int curIdx = 0;
        while(list.size() < len){
            curIdx = (curIdx + 1) % len;
            if(!arr[curIdx] && cnt < sep) {
                cnt++;
            }

            if(cnt == sep && !arr[curIdx]){
                arr[curIdx] = true;
                list.add("" + (curIdx == 0 ? len : curIdx));
                cnt = 0;
            }
        }
        System.out.println("<" + String.join(", ", list.toArray(new String[0])) + ">");

    }
}
