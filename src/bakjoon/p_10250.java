package bakjoon;

import java.util.Scanner;

public class p_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		String answer = "";
		
		for(int i = 0; i < t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			
			int n = sc.nextInt();
			sc.nextLine();
			
			answer += solution(h,w,n);
		}
		
		System.out.println(answer);
	}
	
	public static String solution(int h, int w, int n) {
		
		String answer = "";
		n--;
		int y = n % h + 1;
		int x = n / h + 1;
		
		answer +=  y;
		if(1 <= x && x <= 9) {
			answer += "0" + x + "\n";
		} else {
			answer += x + "\n";
		}
		return answer;
	}
}
