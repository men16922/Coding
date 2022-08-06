package doit;

import java.util.Scanner;

/**
 * 점수 중 최대값을 골라서 M이라 하고, 모든 점수를 점수/M*100 으로 한다. 새로운 평균을 구하라.
 * 
 * @author men16
 *
 */

public class P1546_평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] grades = new int[N];
		long max = 0;
		long sum = 0;
		
		for (int i = 0; i < grades.length; i++) {
			grades[i] = sc.nextInt();
			max = max < grades[i] ? grades[i] : max;
			sum += grades[i];
		}
		
		/**
		 * 각각의 점수를 일일히 계산할 필요 없이, 한 번에 변환된 점수의 평균 점수를 구한다.
		 */
		float answer = (float) sum * 100 / max / N;
		System.out.println(answer);
	}
}
