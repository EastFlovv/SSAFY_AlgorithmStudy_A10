package level2.diff2pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        int[][] map = new int[size][2];

        for (int i = 0; i < size; i++) {
            String[] info = br.readLine().split(" ");
            int[] data = {Integer.parseInt(info[0]), Integer.parseInt(info[1])};
            map[i] = data;
        }

        Arrays.sort(map, (o1, o2)->{
            return o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0];
        });

        for (int[] data : map) {
            sb.append(data[0]).append(" ").append(data[1]).append("\n");
        }
        System.out.println(sb);
    }
}
