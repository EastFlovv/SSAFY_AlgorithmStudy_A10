package challenge;

import java.io.*;
import java.util.Arrays;

public class BOJ1463 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		
		int[] arr = new int[1000001];
		Arrays.fill(arr, Integer.MAX_VALUE);
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 1;
		arr[3] = 1;
		for (int i = 4; i < 1000001; i++) {
			if(i % 3 == 0) arr[i] = Math.min(arr[i], arr[i / 3] + 1);
			if(i % 2 == 0) arr[i] = Math.min(arr[i], arr[i / 2] + 1);
			arr[i] = Math.min(arr[i], arr[i-1] + 1);
		}
		
		System.out.println(arr[target]);
		
	}
}
