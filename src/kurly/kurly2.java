package kurly;

import java.util.Scanner;

public class kurly2 {

	static int maxlength = 0;
	static int cur = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = a; i <= b; i++) {
			cur = i;
			int length = 0;
			while(cur != 1) {
				cur = cal(cur);
				length++;
			}
			maxlength = Math.max(maxlength, length);
		}
		
		System.out.println(maxlength + 1);
	}
	
	public static int cal(int n) {
		if(n % 2 == 0) {
			return n / 2;
		} else {
			return n * 3 + 1;
		}
	}
}
