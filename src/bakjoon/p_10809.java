package bakjoon;

import java.util.Scanner;

public class p_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] arr = new int[26]; // �ҹ��� ����

		for (int j = 0; j < arr.length; j++) { // �ҹ��� ������ŭ loop
			arr[j] = s.indexOf(j + 97);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
