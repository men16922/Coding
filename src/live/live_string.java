package live;

import java.util.Scanner;

public class live_string {
	public static void main(String[] args) {
		int alpabet[] = new int[26];	// ���ĺ�(0~25)�� ���� �迭
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next().toUpperCase();	// ���ڸ� ��� �빮�ڷ� ���
		
		int max = 0;	// ���� ���� ������ ���ĺ��� ã������ ����
		int index = 0;	
		char answer = '?';
		
		for (int i = 0; i < s.length(); i++) {
			index = s.charAt(i) - 65;	// ascii �ڵ��� A = 65 / Z = 90
			alpabet[index] += 1;	
			
			if(max < alpabet[index]) {
				answer = s.charAt(i);
				max = alpabet[index];
			} else if (max == alpabet[index]) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}
