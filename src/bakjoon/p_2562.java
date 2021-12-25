package bakjoon;

import java.util.Scanner;

public class p_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int [] arr = new int [9];
		
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for(int i = 0; i < 9; i ++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				cur = i;
			}
		}
		
		System.out.println(max);
		System.out.println(cur + 1);
	}
}
