package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class p5_1 {
	
	public String solution(String text) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == '(') {
				stack.push(text.charAt(i));
			} else {
				
				if(stack.isEmpty()) {
					return "NO";
				} else {
					stack.pop();
				}	
			} 
				
		}
		if(!stack.isEmpty()) {
			return "NO";
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		p5_1 T = new p5_1();
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		
		System.out.println(T.solution(text));
		
	}
}
