package baekjoon.solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 접근 자체는 괜찮았으나...
// 데이터를 관리하는 방법이 잘못된것 같다
public class G5_1107 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String targetStr = br.readLine();
		int target = Integer.parseInt(targetStr);
		int brokenAmount = Integer.parseInt(br.readLine());
		boolean[] brokens = new boolean[10];
		if(brokenAmount != 0) {
			String[] brokenInfo = br.readLine().split(" ");			
			for (int i = 0; i < brokenAmount; i++) {
				brokens[Integer.parseInt(brokenInfo[i])] = true;
			}
		}
		
		
		int[] minValue = findMinClick(target, 0, 1, 6, brokens);
		
		int targetValue = minValue[0];
		int targetPos = minValue[1];
		int flag = 1;
		while (targetPos >= 10) {
			targetPos /= 10;
			flag++;
		}
		int ans = Math.min((minValue[0] + flag), Math.abs(100 - target));
		System.out.println(ans);
	}
	
	public static int[] findMinClick(int target, int curValue, int deep, int targetDeep, boolean[] brokens) {
//		반환할 값
		int minValue[] = {1000000, 0};
//		깊이가 6이면 종료
		if(deep == targetDeep + 1) {
//			절대값을 반환한다 (거리)
//			System.out.println("deep: " + deep + " | curValue: " + curValue + " | distance: " + Math.abs(target-curValue));
			int[] returnVal = {Math.abs(target - curValue), curValue};
//			return Math.abs(target - curValue);
			return returnVal;
		}
		
		for (int i = 0; i < 10; i++) {
//			System.out.println(">>>>>>> cur deep: " + deep + " | cur i: " + i);
			
			
//			조건?
//			일단 brokens의 값이 false여야 하는데....
//			아직 값이 정히지지 않은 상태 (0)이라면 0이 고장나도 들어가야한다...
			if(!brokens[i] || (curValue == 0 && deep < 6 && i == 0)) {
//				반환된 거리값중 가장 작은 값을 선정
				int nextValue = (int) (curValue + i * Math.pow(10, 6 - deep));
				int[] nextCase = findMinClick(target, nextValue, deep + 1, targetDeep, brokens);
				minValue = minValue[0] > nextCase[0] ? nextCase : minValue;
			}
		}
//		가장 작은 거리값을 반환한다.
		return minValue;
	}
}
