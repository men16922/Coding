package inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class p4_2 {
	
	public String solution(String first, String second) {
		
		String answer = "YES";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : first.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1); // x라는 키가 있으면 value값을 가져오고, 그렇지 않으면 0
		}
		
		for(char x : second.toCharArray()) {
			
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
				map.put(x, map.get(x) -1); // 있으면 value값을 가져오고, 그렇지 않으면 0
			
		}

		return answer;
	}
	
	public static void main(String[] args) {
		
		p4_2 T = new p4_2();
		
		Scanner sc = new Scanner(System.in);
		
		String first = sc.nextLine();
		String second = sc.nextLine();
		
		System.out.println(T.solution(first, second));
	}
}
