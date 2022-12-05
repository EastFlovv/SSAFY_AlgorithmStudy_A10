package baekjoon.solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// 뱀과 사다리 게임
public class G5_16928 {
	public static void main(String[] args) throws IOException{
		
//		주사위 1~6
//		보드 크기 10 * 10
//		결과는 정확히 100에 맞추어야함
//		사다리 -> 상승
//		뱀 -> 하강
		
//		input -> 게임판의 상태
//		output -> 주사위의 최소 수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ladderNsnake = br.readLine().split(" ");
		
//		뱀인지 사다리인지는 중요하지 않다.
		int ls = Integer.parseInt(ladderNsnake[0]) + Integer.parseInt(ladderNsnake[1]);
		
//		뱀과 사다리 정보를 저장할 map
		Map<Integer, Integer> movement = new HashMap<Integer, Integer>();
		for (int i = 0; i < ls; i++) {
			String[] info = br.readLine().split(" ");
			movement.put(Integer.parseInt(info[0]), Integer.parseInt(info[1]));
		}
//		방문처리를 관리할 visited배열
		int[] visited = new int[101];
		
//		bfs를 사용하기 위해 queue를 사용
		Queue<int[]> que = new LinkedList<int[]>();
//		초기세팅을한다
		int[] start = {1, 0};
		que.offer(start);
		
//		무한 반복한다
		while (true) {
//			현재 위치 추출
			int[] curPos = que.poll();
//			이미 방문한 칸에서 더 빨리 가는 경우가 있으면 패스한다
			if(visited[curPos[0]] <= 0) {
				visited[curPos[0]] = curPos[1];
			}else {
				continue;
			}
//			종료조건
			if(curPos[0] == 100) {
//				답 출력
				System.out.println(curPos[1]);
				break;
			}
			
//			다음 6칸 이동
			for (int i = 1; i <= 6; i++) {
//				다음 위치를 담을 노드
				int[] nextNode = new int[2];
//				다음 위치
				int nextPos = i + curPos[0];
//				다음 위치가 100보다 크면 패스
				if(nextPos > 100) continue;
				
//				다음 위치에 이동가능한 요소가 걸려있는지 확인
				if(movement.containsKey(nextPos)) {
//					가능하면 이동
					nextNode[0] = movement.get(nextPos);
				}else{
//					아니면 그대로 입력
					nextNode[0] = nextPos;
				}
//				주사위 굴림 횟수는 같다
				nextNode[1] = curPos[1] + 1;

//				완성된 노드를 큐에 삽입
				que.offer(nextNode);
			}
		};
	}
}
