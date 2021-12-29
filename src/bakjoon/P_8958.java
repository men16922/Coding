package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test_case; i++) {
			
			int cnt = 0; // 연속횟수
			int sum = 0; // 누적 합산
			
			for(byte value : br.readLine().getBytes()) {
				
				if(value == 'O') {
					cnt++;
					sum+=cnt;
				} else {
					cnt = 0;
				}
			}
			
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}
