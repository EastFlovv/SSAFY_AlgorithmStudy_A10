package level2.diff2p;

import java.io.*;

public class BOJ1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringBuilder sb = new StringBuilder();
            String num = br.readLine();
            if (num.equals("0")) break;
//            System.out.println(num);

            for (int i = num.length() - 1; i >= 0; i--) {
                sb.append(num.charAt(i));
            }
            System.out.println(num.contentEquals(sb) ? "yes" : "no");
        }
    }
}
