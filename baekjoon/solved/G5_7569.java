package baekjoon.solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class G5_7569 {
	
//	3차원 배열
//	1이 6방향으로 전파된다
//	-1이 있으면 멈출것
//	로직이후 0이 남아있으면 -1
	
	public static int[] dx = {1, -1, 0, 0, 0, 0};
	public static int[] dy = {0, 0, 1, -1, 0, 0};
	public static int[] dz = {0, 0, 0 ,0, 1, -1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		가로, 세로, 높이를 입력받는다
		String[] initVals = br.readLine().split(" ");
		
//		가로
		int m = Integer.parseInt(initVals[1]);
//		세로
		int n = Integer.parseInt(initVals[0]);
//		높이
		int h = Integer.parseInt(initVals[2]);
		
//		매트릭스 만들기
		int[][][] matrix = new int[h][m][n];
		
//		bfs에서 사용할 Queue
		Queue<int[]> que = new LinkedList<int[]>();
		
//		남은 토마토의 수 기록
		int leftTomatos = 0;
		
//		최대 필요 일수
		int maxDate = 0;
		
//		매트릭스 채움
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < m; j++) {
				String[] line = br.readLine().split(" ");
				for (int k = 0; k < n; k++) {
					int cur = Integer.parseInt(line[k]);
					matrix[i][j][k] = cur;
//					1이 등장하면 que에 추가
					if(cur == 1) {
						int[] node = {i, j , k, 0};
						que.offer(node);
					}else if(cur == 0) leftTomatos++;
				}
			}
		}
//		queue가 비어있지 않다면 반복
		while(!que.isEmpty()) {
			int[] curNode = que.poll();
			if(curNode[3] > maxDate) maxDate = curNode[3];
			for (int i = 0; i < 6; i++) {
//				다음 노드 범위 확인
				int nextZ = curNode[0] + dz[i];
				int nextX = curNode[1] + dy[i];
				int nextY = curNode[2] + dx[i];
				if(
					0 > nextZ || nextZ == h ||
					0 > nextX || nextX == m ||
					0 > nextY || nextY == n					
				) continue;
				
//				다음 검사 노드
				int[] nextNode = {nextZ, nextX, nextY, curNode[3] + 1};
				if(matrix[nextNode[0]][nextNode[1]][nextNode[2]] == 0) {
					leftTomatos--;
					matrix[nextNode[0]][nextNode[1]][nextNode[2]] = 1;
					que.add(nextNode);
				}
			}
		}
		
		if(leftTomatos > 0) System.out.println("-1");
		else System.out.println(maxDate);
		
		
	}
}
