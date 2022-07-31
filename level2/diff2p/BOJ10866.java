package level2.diff2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> deq = new ArrayDeque<String>();
        int orders = Integer.parseInt(br.readLine());

        for (int i = 0; i < orders; i++) {
            String[] order = br.readLine().split(" ");
            switch (order[0]){
                case "push_back":
                    deq.addLast(order[1]);
                    break;

                case "push_front":
                    deq.addFirst(order[1]);
                    break;

                case "pop_front":
                    if(deq.size() > 0)
                        sb.append(deq.removeFirst() + "\n");
                    else
                        sb.append("-1\n");
                    break;

                case "pop_back":
                    if(deq.size() > 0)
                        sb.append(deq.removeLast() + "\n");
                    else
                        sb.append("-1\n");
                    break;

                case "size":
                    sb.append(deq.size() + "\n");
                    break;

                case "empty":
                    sb.append(deq.size() == 0 ? "1\n" : "0\n");
                    break;

                case "front":
                    sb.append(deq.size() == 0 ? "-1\n" : deq.peekFirst() + "\n");
                    break;

                case "back":
                    sb.append(deq.size() == 0 ? "-1\n" : deq.peekLast() + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
