package inflearn;

import java.util.Scanner;

public class p3_6 {

	public int solution(int n) {
		int answer = 0, cnt = 1;
		n--;
		while(n > 0) {
			cnt++;
			n = n - cnt;
			if(n % cnt == 0) answer++;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		p3_5 T = new p3_5();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
