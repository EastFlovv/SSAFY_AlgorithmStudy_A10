package level3.diff3;

import java.io.*;

public class BOJ1074 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] info = br.readLine().split(" ");
		int n = Integer.parseInt(info[0]);
		int r = Integer.parseInt(info[1]);
		int c = Integer.parseInt(info[2]);
		
		int num = 1;
		int[][] field = new int[(int)Math.pow(2, n)][(int)Math.pow(2, n)];
		
		
	}
	
	static int dividNconquer(int[][] field, int n) {
		
		if(n == 2) {
			for (int i = n; i < n+2; i++) {
				for (int j = n; j < n+2; j++) {
					
				}
			}
		}
		
		if(n > 1) {
			for (int i = 0; i < n; i += n/2-1) {
				for (int j = 0; j < n; j += n/2-1) {
					dividNconquer(field, n/2);
				}
			}
		}
		
		
		return 0;
	}
	
}
