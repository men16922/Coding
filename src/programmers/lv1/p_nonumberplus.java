package programmers.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p_nonumberplus {
	
//	public int solution(int[] numbers) {
//        int answer = 0;
//        
//        List<String> checkList = new ArrayList<>();
//        
//        for(int i = 1; i < 10; i++) {
//        	checkList.add(Integer.toString(i));
//        }
//        
//        for(int i = 0; i < numbers.length; i++) {
//        	if(checkList.contains(Integer.toString(numbers[i]))) {
////        		System.out.println(numbers[i]);
//        		checkList.remove(Integer.toString(numbers[i]));
//        	}
//        }
//        
//        
//        for(String s : checkList) {
//        	answer += Integer.parseInt(s);
//        }
//        
//        return answer;
//    }
	
	public int solution(int [] numbers) {
		int sum = 45;
		for(int i : numbers) {
			sum -= i;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		p_nonumberplus p = new p_nonumberplus();
		
		int [] numbers = {1,2,3,4,6,7,8,0};
		
		System.out.println(p.solution(numbers));
		
	}
}
