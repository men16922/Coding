package bakjoon;

import java.util.Scanner;

public class p_16205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] str = sc.nextLine().split(" ");
		String s = str[1];
		
		StringBuilder ans = new StringBuilder();
		StringBuilder ans2 = new StringBuilder();
		
		if(Integer.valueOf(str[0]) == 1) { // 카멜표기법인 경우
			ans.append(s + "\n"); // 카멜
			
			for(int i = 0; i< s.length(); i++) { // 스네이크 표기법으로 만들기
				if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') { // 대문자인 경우
					ans.append("_" + (char)(s.charAt(i) + 32)); // 대문자 아스키코드 + 32를 더해서 소문자로 만든다
				} else {
					ans.append(s.charAt(i));
				}
			}
			ans.append("\n" + (char)(s.charAt(0) - 32) + s.substring(1, s.length())); //파스칼 표기법(첫 글자 대문자)로 만들기
		} else if(Integer.valueOf(str[0]) == 2) { // 스네이크표기법인 경우
			String [] temp = s.split("_"); // _로 문자열 자르기
			
			ans.append(temp[0].substring(0, temp[0].length())); // 카멜표기법 ans 문자열에 첫번째 자른 문자열 넣기
			ans2.append((char)(temp[0].charAt(0) - 32) + temp[0].substring(1, temp[0].length())); // 파스칼표기법 두번째 문자열 대문자로 만들기
			
			if(temp.length > 0) { // 나머지 문자열들에 대하여 처리
				for(int i = 1; i < temp.length; i++) {
					char a = (char) (temp[i].charAt(0) - 32); // 첫 번째 문자 대문자로 만들기
					ans.append(a).append(temp[i].substring(1, temp[i].length())); // 카멜표기법 ans 문자열에 추가
					ans2.append(a).append(temp[i].substring(1, temp[i].length())); // 파스칼표기법 ans2 문자열에 추가
				}
			}
			
			ans.append("\n" + s + "\n" + ans2);
			
		} else if (Integer.valueOf(str[0]) == 3) { // 파스칼표기법
			ans.append((char)(s.charAt(0) + 32) + s.substring(1, s.length()) + "\n"); // 카멜표기법. 소문자로 만들기
			
			for(int i = 0 ; i < s.length(); i++) { // 스네이크표기법으로 만들기
				if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
					ans2.append("_" + (char)(s.charAt(i) + 32)); 
				} else {
					ans2.append(s.charAt(i));
				}
			}
			
			ans.append(ans2.substring(1, ans2.length()));
			ans.append("\n" + s);
		}
		
		System.out.println(ans);
	}
}
