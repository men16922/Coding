package inflearn;

import java.util.Arrays;
import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class p6_5 {
	
//	public String solution(int [] arr) {
//		
//		String answer = "U";
//		Map<Integer, Integer> sMap = new HashMap<>();
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(sMap.containsValue(arr[i])) {
//				answer = "D";
//				break;
//			} else {
//				sMap.put(i,  arr[i]);
//			}
//		}
//		
//		return answer;
//	}
	
	public String solution(int [] arr) {
		String answer = "U";
		Arrays.sort(arr); // 오름차순 기본 정렬
		
		for(int i = 0 ; i < arr.length - 1; i++) {
			if(arr[i] == arr[i+1]) return "D";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		p6_5 T = new p6_5();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(arr));
		
	}
}
