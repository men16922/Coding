package doit;

import java.util.Scanner;

/**
 * N���� ���ڰ� ���� ���� �� �ִ�. �� ���ڸ� ��� ���� ����϶�.
 * @author men16
 *
 */
public class P11720_�������� {

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
