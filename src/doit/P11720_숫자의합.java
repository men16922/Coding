package doit;

import java.util.Scanner;

/**
 * N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하라.
 * @author men16
 *
 */
public class P11720_숫자의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int answer = 0;
		
		for(int i = 0; i < input.length(); i++) {
			answer += input.charAt(i) - '0';
		}
		
		System.out.println(answer);
		
		
	}
}
