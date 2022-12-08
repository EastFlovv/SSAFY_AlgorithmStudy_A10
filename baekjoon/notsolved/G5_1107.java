// 못품
// 다시한번 생각을 정리해서 풀것
package baekjoon.notsolved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G5_1107 {
	public static void main(String[] args) throws IOException{
//		이동하고자 하는 채널
//		고장난 버튼 수
//		고장난 버튼의 정보
//		고장나는 버튼의 경우 0 ~ 9
		
//		목표치에서 이동?
//		배열에서 T/F 처리
		
//		거리의 경우....
//		상향거리, 하향거리 모두 측정
//		가장 가까운 경우의 수를 측정한 뒤...
//		(+혹은 -를 누르는 수) + (숫자갯수의 수)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String targetString = br.readLine();
		int target = Integer.parseInt(targetString);
		int brokenAmount = Integer.parseInt(br.readLine());
		String[] brokenInfo = br.readLine().split(" ");
		
//		고장난 버튼은 true 
		boolean[] brokenBools = new boolean[10];
		
		for (int i = 0; i < brokenAmount; i++) {
			brokenBools[Integer.parseInt(brokenInfo[i])] = true;
		}
		
//		상향 분기점
		boolean upDir = false;
		int upNum = 0;
//		하향 분기점
		boolean downDir = false;
		int downNum = 0;
		
//		각 자리 수 만큼 반복
		for (int i = 0; i < targetString.length(); i++) {
			int curTarget = targetString.charAt(i) - 48;
//			분기점 선택
			if(!upDir && !downDir) {
				int l = curTarget;
				int r = curTarget;
				while (!upDir && !downDir) {
					if(!brokenBools[l]) {
						upDir = true;
						upNum += (int) (l * Math.pow(10, targetString.length() - i - 1));
					}
					if(!brokenBools[r]) {
						downDir = true;
						downNum += (int) (r * Math.pow(10, targetString.length() - i - 1));						
					}
//					아직 분기점이 정해지지 않았다면... 거리를 늘린다
					if(!upDir && !downDir) {
						l = l != 0 ? l - 1 : l;
						r = r != 9 ? r + 1 : r;
					}
				}
			}else {
//				분기점이 정해진 상태일때...
//				상향 분기점을 선택한 경우, 0에서 상향한다.
				if(upDir) {
					int flag = 0;
					while (true) {
//						현재 플래그를 사용 가능하면 값을 더하고 멈춘다.
						if(!brokenBools[flag]) {
							upNum += (int) (flag * Math.pow(10, targetString.length() - i - 1));
							break;
						}else flag++;
					}
				}
				
//				하향 분기점을 선택한 경우, 9에서 하향한다.
				if(downDir) {
					int flag = 9;
					while (true) {
//						현재 플래그를 사용 가능하면 값을 더하고 멈춘다.
						if(!brokenBools[flag]) {
							downNum += (int) (flag * Math.pow(10, targetString.length() - i - 1));
							break;
						}else flag--;
					}
				}
			}
		}
//		각 수의 최소거리를 구한다
		int upMin = Math.abs(target - upNum);
		int downMin = Math.abs(target - downNum);
		
		int minDis = 0;
		if(upMin > downMin) {
			minDis = upMin;
			while (upMin / 10 != 0) {
				upMin = upMin/10;
				minDis++;
			}
		}else {
			minDis = downMin;
			while (downMin / 10 != 0) {
				downMin = downMin/10;
				minDis++;
			}
		}
		
//		구해진 최소거리를 target과 100과의 거리를 비교하여 재 설정
		minDis = minDis > Math.abs(100 - Integer.parseInt(targetString)) ? Math.abs(100-Integer.parseInt(targetString)) : minDis;
		
		System.out.println(minDis);
	}
	
	
//	두 거리가 같은경우...
//	1. 두 다음 버튼이 가능하고, 이 수가 첫번째 수 인경우
//	-> 상/하향으로 분기한다?
//	2. 두 다음 버튼이 가능하고 이 수가 첫번쨰 수가 아닌 경우
//	-> 분기점의 반대방향으로 이동한다
//	3. 두 다음버튼의 거리가 다른경우?
//	-> 분기점의 반대에서 가장 처음으로 나오는 수를 선택한다.
		
	
	
	
	
	
}
