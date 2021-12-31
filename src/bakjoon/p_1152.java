package bakjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(text, " ");
		
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt ++;
		}
		
		System.out.println(cnt);
	}
}
