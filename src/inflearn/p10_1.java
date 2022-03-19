package inflearn;

import java.util.Scanner;

public class p10_1 {
	static int [] dy;
	
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3; i<= n; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		
		return dy[n];
	}
	
	public static void main(String[] args) {
		p10_1 T = new p10_1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		dy = new int [n+1];
		System.out.println(T.solution(n));
	}
}
