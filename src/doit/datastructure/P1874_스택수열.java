package doit.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택수열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] nArr = new int [n];
		
		for(int i = 0; i < n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		int num  = 1; // 오름차순 수
		boolean result = true;
		
		for(int i = 0; i < n; i++) {
			
			if(nArr[i] >= num) {
				while(nArr[i] >= num) { // 현재 수열 값 >= 오름차순 자연수: 값이 같아질 때까지 push() 수행
					stack.push(num++);
					bf.append("+\n");
				}
				
				stack.pop();
				bf.append("-\n");
			} else { // 현재 수열 값 < 오름차순 자연수 : pop()을 수행해 수열 원소를 꺼냄
				int cur = stack.pop();
				if(cur > nArr[i]) { // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음
					System.out.println("NO"); // 이 경우에는 출력하는 스택의 가장 위의 수가 출력해야 할 수보다 커져서, 나와야 할 값이 표현되지 않음
					/**
					 * 현재 스택이 3,4이고 다음 값이 3인 경우, 출력해야 할 값은 다음 값인 3과 일치해야 하는데, 4가 먼저 나오면서 최초 입력 배열과 출력되는 배열이 달라진다.
					 */
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
			
		}
		
		if(result) System.out.println(bf.toString());
		sc.close();
	}
	
}
