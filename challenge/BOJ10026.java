package challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10026 {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        char[][] normalPicture = new char[size][size];
        char[][] colorWeakPicture = new char[size][size];
        boolean[][] normal = new boolean[size][size];
        boolean[][] colorWeak = new boolean[size][size];
        int normalFields = 0;
        int colorWeakFields = 0;


        for (int i = 0; i < size; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < size; j++) {
                normalPicture[i][j] = line[j];
                colorWeakPicture[i][j] = line[j] == 'G' ? 'R' : line[j];
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(!normal[i][j]) {
                    check(normal, normalPicture, i, j);
                    normalFields++;
                }
                if(!colorWeak[i][j]){
                    check(colorWeak, colorWeakPicture, i, j);
                    colorWeakFields++;
                }
            }
        }

        System.out.println(normalFields + " " + colorWeakFields);

    }

    static void check(boolean[][] arr, char[][] picture, int i, int j){
        arr[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int ni = i + dx[k];
            int nj = j + dy[k];
            if(0 <= ni && ni < arr.length && 0 <= nj && nj < arr.length){
                if(picture[ni][nj] == picture[i][j] && (!arr[ni][nj])) check(arr, picture, ni, nj);
            }
        }
    }

}
