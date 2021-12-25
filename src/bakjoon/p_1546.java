package bakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class p_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double answer = 0;
		
		double [] arr = new double [n];
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextDouble();
		}

		sc.close();
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {

			answer += arr[i]/arr[arr.length - 1]*100;
		}
		
		answer = answer / n;
		
		System.out.println(answer);
		
	}
}
