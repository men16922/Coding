package bakjoon;

import java.util.Scanner;

public class p_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = -1;
		if(c - b <= 0) {
			System.out.println(result);
		} else {
			result = a / (c - b) + 1;
			System.out.println(result);
		}
		
		
		
		
	}
}
