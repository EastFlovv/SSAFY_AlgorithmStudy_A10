package baekjoon.notsolved;


// 33% 틀림
// 틀리는 이유를 모르겠다.
// 나중에 싹 밀고 다시 풀것


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class G5_5430 {
	public static void main(String[] args) throws IOException{
//		R은 reverse
//		D는 delete
		
//		짝수개의 연속된 R은 없앤다
//		홀수개의 연속된 R은 하나로 만든다
		
//		Queue에 배열을 담아
//		뒤집지 않고 앞뒤로 삭제한다
		
//		출력은 현재 포인터 상태에 따라 다른 로직을 쓴다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
//		테스트 케이스의 수
		int tcs = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tcs; i++) {
//			명령어
			char[] orders = br.readLine().toCharArray();			
//			배열의 길이는 leng
			int leng = Integer.parseInt(br.readLine());
			
//			배열을 일단 String의 배열로 분해
			String str = br.readLine();
			String[] arrString = str.substring(1, str.length()-1).split(",");
			
//			명령을 압축한다
			List<Character> compressOrder = new ArrayList<Character>();
			char curOrder = 'A';
			int rCount = 0;
			int dCount = 0;
			for (char order : orders) {
//				시작시
				if(curOrder == 'A') {
//					현재 오더를 설정
					curOrder = order;
//					R이면 R카운트 증가
					if(order == 'R') rCount++;
					else {
//						D면 D카운트를 증가시키고 list에 D를 추가
						dCount++;
						compressOrder.add('D');
					}
//				시작 이후 이전 명령이 R일때
				}else if(curOrder == 'R'){
//					다음 명령이 D라면
					if(order == 'D') {
//						압축 규칙에 따라 R을 추가할지 말지 결정하고
						if(rCount % 2 != 0) compressOrder.add('R');
//						dcount증가 후 list에 D를 추가
						dCount++;
						compressOrder.add('D');
//						r카운트는 0으로 초기화
						rCount = 0;
//					그 외에 R이 연속으로 나오는 경우엔
					}else {
//						rCOunt증가
						rCount++;
					}
//				이전 명령이 D일때
				}else {
//					R이 등장하면 rCount증가
					if(order == 'R') {
						rCount++;
					}else {
//						d등장 처리
						dCount++;
						compressOrder.add('D');
					}
				}
			}
//			반복문 종료
			
//			R카운트가 남아있다면 후처리를 해줘야 한다
			if(rCount != 0) {
				if(rCount % 2 != 0) compressOrder.add('R');
			}
			
//			에러를 여러번 출력해야한다?
//			삭제할것이 전체 길이보다 길면 error 출력하고 처음으로 돌아간다.
			if(dCount > leng) {
				sb.append("error\n");
				continue;
			}
			
//			이곳에 오면 이 명령은 수행 가능한 명령이다
//			배열을 Queue로 전환
			Deque<String> deque = new ArrayDeque<String>();
			for (String s : arrString) {
				deque.addLast(s);
			}
			
//			현재  배열이 정방향인지 역방향인지 표시하는 pointer
//			true는 정방향이다
			boolean pointer = true;
//			명령 수행
			for (char order : compressOrder) {
				if(order == 'R') {
					pointer = !pointer;
				}else {
					if(pointer) deque.poll();
					else deque.pollLast();
				}
			}
			
//			출력을 위해 StringBuilder에 모은다
			sb.append("[");
			int size = deque.size();
			for (int j = 0; j < size; j++) {
				if(pointer) sb.append(deque.poll());
				else sb.append(deque.pollLast());
				if(deque.size() != 0) sb.append(",");
			}
			sb.append("]\n");
		}
		
		System.out.println(sb);
	}
}
