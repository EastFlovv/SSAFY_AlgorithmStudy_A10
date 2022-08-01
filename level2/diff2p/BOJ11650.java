package level2.diff2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ11650{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());

        List<String[]> list = new ArrayList<String[]>();
        for (int i = 0; i < size; i++)
            list.add(br.readLine().split(" "));


        Collections.sort(list, (o1, o2) -> {
            int x1 =Integer.parseInt(o1[0]);
            int x2 =Integer.parseInt(o2[0]);

            int y1 =Integer.parseInt(o1[1]);
            int y2 =Integer.parseInt(o2[1]);

            if(x1 == x2)
                return y1 - y2;
            else
                return x1 - x2;
        });

        for (String[] s: list)
            sb.append(s[0]).append(" ").append(s[1] + "\n");

        System.out.println(sb);

    }
}
