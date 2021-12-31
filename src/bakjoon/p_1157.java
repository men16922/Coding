package bakjoon;

import java.io.IOException;

/**
 * 단어 입력하면, 가장 많이 사용된 알파벳 출력
 * @author men16
 *
 */
public class p_1157 {
	public static void main(String[] args) throws IOException {
		int [] arr = new int [26]; // 영문자의 개수
		
		int c = System.in.read();
		
		while (c > 64) { // 공백을 입력받는 순간 종료
			
			if(c < 91) { // 대문자이면
				arr[c - 65]++; 
			} else { // 소문자이면
				arr[c - 97]++; 
			}
			c = System.in.read();
		}
		
		int max = -1;
		int ch = -2; // ? 는 63 이다.
		
		for(int i = 0; i < 26; i++) {
			
			if(arr[i] > max) { // array의 i가 최대값보다 크면, max 값 세팅
				max = arr[i];
				ch = i;
			} else if (arr[i] == max) { // array의 i가 최대값이면 -> max 값이 여러개
				ch = -2; // 63(?) 출력
			}
		}
		System.out.println((char) (ch + 65));
	}
}
