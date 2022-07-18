package level1.diff1;

import java.io.*;

public class BOJ2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++){
            String infos[] = br.readLine().split(" ");
            int rep = Integer.parseInt(infos[0]);
            String ans = "";
            for (int j = 0; j < infos[1].length(); j++){
                for (int k = 0; k < rep; k++){
                    ans += infos[1].charAt(j);
                }
            }
            System.out.println(ans);
        }
    }
}
