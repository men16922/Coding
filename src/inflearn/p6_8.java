package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class p6_8 {
	
	public int solution(int n, int m, int [] arr) {
		int answer = 0;
		Arrays.sort(arr); // 오름차순 정렬
		int lt = 0, rt = n -1;
		while(lt <= rt) {
			int mid = (lt + rt) / 2; 
			if(arr[mid] == m) {
				answer = mid + 1;
				break;
			}
			if(arr[mid] > m) rt = mid - 1;
			else lt = mid + 1;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		p6_8 T = new p6_8();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(T.solution(n, m, arr));
		
		
	}
}
