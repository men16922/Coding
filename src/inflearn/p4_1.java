package inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class p4_1 {
	
	public char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1); // x라는 키가 있으면 value값을 가져오고, 그렇지 않으면 0
		}
		
		int max = 0;
		
		for(char x : map.keySet()) {
			if(max < map.get(x)) {
				max = map.get(x);
				answer = x;
			}
//			System.out.println(x + " " + map.get(x));
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		p4_1 T = new p4_1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
