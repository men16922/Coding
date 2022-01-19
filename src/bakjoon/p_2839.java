package bakjoon;

import java.util.Scanner;

public class p_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = - 1;
		
		for(int i = 0;  i * 3 <=n; i++) {
			if((n - i * 3) % 5 == 0) {
				answer = i + ((n - i * 3) / 5);
				break;
			}
		}
		
		System.out.println(answer);
	}
}
