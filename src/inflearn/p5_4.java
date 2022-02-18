package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class p5_4 {
	
	public int solution(String input) {
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : input.toCharArray()) {
			if(Character.isDigit(x)) { // 1 ~ 9 의 숫자
				stack.push(x - '0');
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				
				if(x == '+') {
					answer = lt + rt;
				} else if (x == '*') {
					answer = lt * rt;
				} else if (x == '-') {
					answer = lt - rt;
				} else if (x == '/') {
					answer = lt / rt;
				}
				stack.push(answer);
			}
		}
		
		return answer;
	}
	
	/**
	 * stack으로 후위식 처리
	 * @param args
	 */
	public static void main(String[] args) {
		
		p5_4 T = new p5_4();
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		
		System.out.println(T.solution(text));
	}
}
