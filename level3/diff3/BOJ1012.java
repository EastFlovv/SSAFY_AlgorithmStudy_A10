package level3.diff3;

import java.io.*;

public class BOJ1012 {
	
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int tcs = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < tcs; tc++) {
			String info[] = br.readLine().split(" ");
			int m = Integer.parseInt(info[0]);
			int n = Integer.parseInt(info[1]);
			int k = Integer.parseInt(info[2]);
			
			int[][] field = new int[n][m];
			boolean[][] boolfield = new boolean[n][m];
			
			for (int i = 0; i < k; i++) {
				String[] pos = br.readLine().split(" ");
				field[Integer.parseInt(pos[1])][Integer.parseInt(pos[0])] = 1;
			}
			
			int ans = 0;
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (!boolfield[i][j] && field[i][j] == 1) {
//						System.out.println("line 34: 재귀 진입 >>> " + i + ", " + j);
						check(field, boolfield, i, j);
						ans++;
					}
				}
			}
			
			sb.append(ans).append("\n");
		}
		System.out.println(sb);
	}
	
	static void check(int[][] field, boolean[][] boolfield, int i, int j) {
		boolfield[i][j] = true;
//		System.out.println("line 47 재귀내에서의 이동 >>> " + i + ", " + j);
		for (int j2 = 0; j2 < 4; j2++) {
			int nr = i + dx[j2];
			int nc = j + dy[j2];
			
			if(nr < 0 || nr == field.length || nc < 0 || nc == field[0].length) continue;
			if(field[nr][nc] == 1 && !boolfield[nr][nc]) 
				check(field, boolfield, nr, nc);
		}
	}
	
}
