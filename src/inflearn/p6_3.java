package inflearn;

import java.util.Scanner;

/**
 * 삽입 정렬
 * @author men16
 *
 */
public class p6_3 {
	
	public int [] solution(int n, int [] arr) {
		
		for(int i = 1; i < n; i++) { 
			int tmp = arr[i]; // i번쨰 
			int j;
			for(j = i - 1; j >= 0 && arr[j] > tmp; j--) { // i번째부터 시작해서, 0번째 index까지 loop
				arr[j+1] = arr[j]; // 만약 j번째 숫자가 tmp보다 크면, j+1번째에 j번째 숫자를 넣는다
			}
			arr[j+1] = tmp; // j가 멈춘 지점의 + 1 지점에다 tmp를 넣는다.
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		p6_3 T = new p6_3();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}
