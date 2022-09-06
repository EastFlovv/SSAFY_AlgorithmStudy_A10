package level3.diff3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2178 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] dx = {0, 0, -1, 1}; 
		int[] dy = {-1, 1, 0, 0}; 
		
		
		String[] size = br.readLine().split(" ");
		int r = Integer.parseInt(size[0]);
		int c = Integer.parseInt(size[1]);
		
		int[][] map = new int[r][c];
		boolean[][] boolMap = new boolean[r][c];
		boolMap[0][0] = true;
		
		for (int i = 0; i < r; i++) {
			char[] line = br.readLine().toCharArray();
			for (int j = 0; j < c; j++) {
				map[i][j] = line[j] - '0';
			}
		}
		
		Queue<int[]> que = new LinkedList<int[]>();
		int[] node = {0, 0, 1}; 
		que.offer(node);
		
		while (true) {
			int[] cur = que.poll();
			if(cur[0] == r-1 && cur[1] == c-1) {
				System.out.println(cur[2]);
				break;
			}
			
			for (int i = 0; i < 4; i++) {
				int nr = cur[0] + dx[i];
				int nc = cur[1] + dy[i];
				
				if(nr < 0 || nr == r || nc < 0 || nc == c) continue;
				if(boolMap[nr][nc] || map[nr][nc] == 0) continue;
				int[] next = {nr, nc, cur[2] + 1};
				que.offer(next);
				boolMap[nr][nc] = true;
			}
		}
		
	}
}
