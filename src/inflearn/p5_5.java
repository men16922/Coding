package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class p5_5 {
	
	public int solution(String text) {
		
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				if(text.charAt(i-1) == '(') answer += stack.size();
				else answer++;
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		p5_5 T = new p5_5();
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		
		System.out.println(T.solution(text));
	}
}
