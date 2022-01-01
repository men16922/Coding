package bakjoon;

import java.util.Scanner;

public class p_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		
		StringBuilder sb = new StringBuilder(first);
		
		int f = Integer.parseInt(sb.reverse().toString());
		
		sb = new StringBuilder(second);
		int s = Integer.parseInt(sb.reverse().toString());
		
		if(f > s) {
			System.out.println(f);
		} else {
			System.out.println(s);
		}
	}
}
