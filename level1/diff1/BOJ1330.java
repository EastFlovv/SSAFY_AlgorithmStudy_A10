package level1.diff1;

import java.io.*;
import java.util.*;

public class BOJ1330 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b){
            System.out.println('>');
        }else if (a < b){
            System.out.println('<');
        }else{
            System.out.println("==");
        }
    }
}
