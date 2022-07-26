package level2.diff2p;

import java.io.*;

public class BOJ1181_FAIL {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
//        System.out.println('w' > 'm');
        int size = Integer.parseInt(br.readLine());
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = br.readLine();
        }
        String tmp = "";
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
//                단어가 길면 자리 바꿈
                if (arr[i].length() > arr[j].length()){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                else if(arr[i].length() == arr[j].length()) {
                    for (int k = 0; k < arr[i].length(); k++) {
                        if(arr[i].charAt(k) > arr[j].charAt(k)){
                            tmp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tmp;
                            break;
                        }else if (arr[i].charAt(k) < arr[j].charAt(k))
                            break;
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i].length() != arr[j].length()) break;
                else if(arr[i].equals(arr[j])) {
                    arr[j] = "";
                }
            }
        }


        for (String s : arr) {
            sb.append(s.equals("") ? "" : s + "\n");
        }

        System.out.println(sb);

    }
}
