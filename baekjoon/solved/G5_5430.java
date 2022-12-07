package baekjoon.solved;


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
		
		for (int tc = 0; tc < tcs; tc++) {
//			현재 덱의 상태를 표시
			boolean isForward = true;
			boolean isError = false;
//			명령어
			String orders = br.readLine();
//			초기 배열의 길이
			int originLeng = Integer.parseInt(br.readLine());
			
//			실제 입력 받은 arr값
			String originArr = br.readLine();
//			대괄호 제거
			String noneBraket = originArr.substring(1, originArr.length()-1);
//			배열로 전환
			String[] valueArr = noneBraket.split(",");
//			값 처리를 위한 deq
			Deque<String> deq = new ArrayDeque<String>();
//			값 삽입
			for (int i = 0; i < originLeng; i++) {
				deq.offerLast(valueArr[i]);
			}
			
			for (int i = 0; i < orders.length(); i++) {
//				명령어가 R이면 isForward 반전
				if(orders.charAt(i) == 'R') isForward = !isForward;
				else {
//					그외 명령(D)이면 삭제 한다. 단, 현재 deq의 길이가 0인 상태에서 D명령이 등장하면 error를 출력하고 멈춘다.
					if(deq.size() == 0) {
						sb.append("error");
						isError = true;
						break;
					}else {
						if(isForward) deq.poll();
						else deq.pollLast();
					}
				}
			}
//			에러가 발생하지 않았을 경우 처리
			if(!isError) {
				sb.append("[");
				int leftDeqLeng = deq.size();
				for (int i = 0; i < leftDeqLeng; i++) {
//					isForward에 따라 앞을 뺄지 뒤를 뺄지 결정한다.
					sb.append(isForward ? deq.poll() : deq.pollLast());
					if(i != leftDeqLeng - 1) sb.append(",");
				}
				sb.append("]");
			}
			if(tc != tcs - 1) sb.append("\n");
		}
		System.out.println(sb);
	}
}
