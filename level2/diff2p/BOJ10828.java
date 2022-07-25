package level2.diff2p;

import java.io.*;

public class BOJ10828 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int orders = Integer.parseInt(br.readLine());

        int stack[] = new int[10000];
        int top = 0;

        for (int i = 0; i < orders; i++) {
            String[] order = br.readLine().split(" ");
            switch (order[0]){
                case "push":
                    stack[top++] = Integer.parseInt(order[1]);
                    break;
                case "pop":
                    if(top == 0)
                        sb.append("-1\n");
                    else {
                        top--;
                        sb.append(stack[top] + "\n");
                    }
                    break;
                case "size":
                    sb.append(top + "\n");
                    break;
                case "empty":
                    if(top == 0)
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                case "top":
                    if(top == 0)
                        sb.append("-1\n");
                    else {
                        sb.append(stack[top - 1]);
                        sb.append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);

    }
}
