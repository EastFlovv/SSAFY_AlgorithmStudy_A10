package level1.diff1p;

import java.io.*;

public class BOJ2920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String harmony = String.join("", br.readLine().split(" "));
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++) {
            if(i+1 != harmony.charAt(i) - 48) ascending = false;
            if(8-i != harmony.charAt(i) - 48) descending = false;
        }

        System.out.println(ascending ? "ascending" : descending ? "descending" : "mixed");

    }
}
