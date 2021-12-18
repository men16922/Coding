package inflearn;

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input = in.next();
		
		input = input + " ";
		int count = 0;
		char cnt = ' ';
		String ans = "";
		char [] answer = input.toCharArray();
		for(int i = 0; i < answer.length; i++) {
			if(cnt == answer[i]) {
				count++;
			} else {
				if(count == 0 && cnt != ' ') {

					ans += Character.toString(cnt);
				} else if(cnt != ' ') {
					
					ans += Character.toString(cnt) + String.valueOf(count + 1);
				}
				cnt = answer[i];
				count = 0;
			}
		}
		
		System.out.println(ans);
	}
}
