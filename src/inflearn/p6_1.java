package inflearn;

import java.util.Scanner;

public class p6_1 {
	
	public int [] solution(int s, int [] arr) {
		
		for(int i = 0; i < s - 1; i++) {
			for(int j = i +1; j < s; j++) {
				int idx = i;
				if(arr[j] < arr[i]) {
					idx = j;
				}
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		p6_1 T = new p6_1();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int s : T.solution(n, arr)) {
			System.out.print(s + " ");
		}
	}
}
