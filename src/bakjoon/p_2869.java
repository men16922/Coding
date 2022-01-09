package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 달팽이가 v미터인 나무 막대를 오른다
 * 하루에 a미터 올라가고 b미터 미끄러진다
 * 며칠 걸리는가?
 * @author men16
 *
 */
public class p_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String T = br.readLine();
		
		StringTokenizer st = new StringTokenizer(T);
		
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		int day = 0; // 몇일 걸리는지
		
		
		day = (v - b) / (a - b);
		if((v - b) % (a - b) !=0) {
			day++;
		}
		
		System.out.println(day);
	}
}
