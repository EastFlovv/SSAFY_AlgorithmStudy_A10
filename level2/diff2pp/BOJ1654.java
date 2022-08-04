package level2.diff2pp;

import java.io.*;

public class BOJ1654 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] info = br.readLine().split(" ");
		
		int lines = Integer.parseInt(info[0]);
		int need = Integer.parseInt(info[1]);
		
		int[] lineLens = new int[lines];
		
		long maxLen = Integer.MAX_VALUE;
		long minLen = 1;
		
		for (int i = 0; i < lines; i++) {
			int cur = Integer.parseInt(br.readLine());
			lineLens[i] = cur;
			maxLen = Math.max(maxLen, cur);
		}
//		init fin

//		이분 탐색 
		while (true) {
			long temp = (int)((maxLen + minLen) / 2);
			if(temp == minLen) break;
			long curCuts = 0l;
			for (int i : lineLens) {
				curCuts += (int)((i / temp));
			}
			
			if(curCuts < need) {
				maxLen = temp;
			}else if(curCuts >= need) {
				minLen = temp;
			}
			
		}

		int maxcount = 0;
		int mincount = 0;
		
		for (int i : lineLens) {
			mincount += (int)(i / minLen);
			maxcount += (int)(i / maxLen);
		}
		System.out.println(maxcount == mincount ? maxLen : minLen);
		
		
	}
}
