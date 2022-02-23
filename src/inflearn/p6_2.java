package inflearn;

import java.util.Scanner;

public class p6_2 {
	
	public int[] solution(int n, int [] arr) {
		 for(int i = 0; i < n-1; i++) { // n-1 번 loop한다.
			 for(int j = 0; j < n-i-1; j++) { // i=0이면 3까지, i=1이면 2 ...
				 // 처음에 n-1 번 index 결정되고, 그 다음에 n-2, n-3 index가 결정되는 식
				 if(arr[j] > arr[j+1]) { // 뒤가 작으면 swap
					 int tmp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = tmp;
				 }
			 }
		 }
		 return arr;
	}
	
	public static void main(String[] args) {
		p6_2 T = new p6_2();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int s : T.solution(n, arr)) {
			System.out.print(s + " ");
		}
	}
}
