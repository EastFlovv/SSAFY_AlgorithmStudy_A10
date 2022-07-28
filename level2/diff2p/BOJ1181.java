package level2.diff2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 1720ms

public class BOJ1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();

//        System.out.println("f".compareTo("c"));
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            String word = br.readLine();
            if(!list.contains(word))
                list.add(word);
        }

        Collections.sort(list, (o1, o2) -> {
            if (o1.length() > o2.length()) return 1;
            else if(o1.length() == o2.length()){
                if(o1.compareTo(o2) > 0)
                    return 1;
            }
            return -1;
        });

        for (String w: list) {
            sb.append(w + "\n");
        }
        System.out.println(sb);
    }
}
