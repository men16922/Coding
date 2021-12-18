package live;

import java.util.Scanner;

public class live_string {
	public static void main(String[] args) {
		int alpabet[] = new int[26];	// 알파벳(0~25)을 담을 배열
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next().toUpperCase();	// 문자를 모두 대문자로 취급
		
		int max = 0;	// 가장 많이 나오는 알파벳을 찾기위한 변수
		int index = 0;	
		char answer = '?';
		
		for (int i = 0; i < s.length(); i++) {
			index = s.charAt(i) - 65;	// ascii 코드의 A = 65 / Z = 90
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
