package level2.diff2pp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        while (true){
            char[] charArr = br.readLine().toCharArray();
            boolean isEnd = false;
            if(charArr[0] == '.') break;
            for (char c : charArr) {

                if(c == '.') isEnd = true;

                if(c == '(' || c == '[')
                    stack.push(c);

                if(c == ')'){
                    if(stack.size() != 0 && stack.peek() == '(') stack.pop();
                    else stack.push(c);
                }

                if(c == ']'){
                    if(stack.size() != 0 && stack.peek() == '[') stack.pop();
                    else stack.push(c);
                }
            }
            if(isEnd){
                sb.append(stack.size() == 0 ? "yes\n" : "no\n");
                stack.clear();
            }
        }
        System.out.println(sb);
    }
}
