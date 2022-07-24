package level2.diff2p;

import java.io.*;
import java.util.*;

public class BOJ10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
//        String[][] info = new String[size][2];
        String[] infos = new String[size];
//        for (int i = 0; i < size; i++) {
//            info[i] = br.readLine().split(" ");
//        }
        for (int i = 0; i < size; i++) {
            infos[i] = br.readLine();
        }

        Arrays.sort(infos, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] a = o1.split(" ");
                String[] b = o2.split(" ");
                return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
            }
        });





//        for (int i = size-1; i >= 0; i--) {
//            for (int j = i-1; j >= 0; j--) {
//                if (Integer.parseInt(info[i][0]) < Integer.parseInt(info[j][0])){
//                    String[] tmp = info[i];
//                    info[i] = info[j];
//                    info[j] = tmp;
//                }
//            }
//        }

//        for (String[] user: info) {
//            sb.append(user[0] + " " + user[1] + "\n");
//        }
        for (String user: infos) {
            sb.append(user + "\n");
        }
        System.out.println(sb);
    }
}
