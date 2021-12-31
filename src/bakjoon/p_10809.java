package bakjoon;

import java.util.Scanner;

public class p_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = new int[26]; // 소문자 개수

		for (int j = 0; j < arr.length; j++) { // 소문자 개수만큼 loop
			arr[j] = s.indexOf(j + 97);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
