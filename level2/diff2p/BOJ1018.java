package level2.diff2p;

import java.io.*;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizeInfo = br.readLine().split(" ");
        int row = Integer.parseInt(sizeInfo[0]);
        int col = Integer.parseInt(sizeInfo[1]);
        char[][] board = new char[row][col];

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < board.length; i++) {
            board[i] = br.readLine().toCharArray();
        }

        for (int k = 0; k < row - 7; k++) {
            for (int l = 0; l < col - 7; l++) {
                int case1 = 0;
                int case2 = 0;
//        case: W
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {

                        if (i % 2 == j % 2 && board[k+i][l+j] - 'W' != 0) {
                            case1++;
                        } else if (i % 2 != j % 2 && board[k+i][l+j] - 'W' == 0) {
                            case1++;
                        }
                    }
                }
//       case: B
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {

                        if (i % 2 == j % 2 && board[k+i][l+j] - 'B' != 0) {
                            case2++;
                        } else if (i % 2 != j % 2 && board[k+i][l+j] - 'B' == 0) {
                            case2++;
                        }
                    }
                }

                ans = Math.min(ans, Math.min(case1, case2));

            }
        }
        System.out.println(ans);
    }
}
