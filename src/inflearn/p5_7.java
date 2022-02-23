package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p5_7 {

	public String solution(String order, String userOrder) {
		
		String answer = "YES";
		
		Queue<Character> queue = new LinkedList<>();
		
		for(char x : order.toCharArray()) {
			queue.offer(x);
		}
		
		for(char y : userOrder.toCharArray()) {
			
			if(queue.contains(y)) {
				if(y!=queue.poll()) return "NO";

			} 
		}
		
		if(!queue.isEmpty()) return "NO";

		return answer;
	}
	
	
	public static void main(String[] args) {
		
		p5_7 T = new p5_7();
		
		Scanner sc = new Scanner(System.in);
		
		String order = sc.nextLine();
		String userOrder = sc.next();
		
		System.out.println(T.solution(order, userOrder));
		
	}
}
