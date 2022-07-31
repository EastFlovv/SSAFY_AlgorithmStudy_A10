package level2.diff2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        int orders = Integer.parseInt(br.readLine());
        for (int i = 0; i < orders; i++) {
            String[] order = br.readLine().split(" ");
            switch (order[0]){
                case "push":
                    list.add(order[1]);
                    break;

                case "pop":
                    if(list.size() > 0)
                        sb.append(list.remove(0) + "\n");
                    else
                        sb.append("-1\n");
                    break;

                case "size":
                    sb.append(list.size() + "\n");
                    break;

                case "empty":
                    sb.append(list.size() == 0 ? "1\n" : "0\n");
                    break;

                case "front":
                    sb.append(list.size() == 0 ? "-1\n" : list.get(0) + "\n");
                    break;

                case "back":
                    sb.append(list.size() == 0 ? "-1\n" : list.get(list.size()-1) + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
