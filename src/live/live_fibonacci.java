package live;

import java.util.Scanner;

public class live_fibonacci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt(); // 8°³ Ãâ·Â

		for (int i = 1; i <= input; i++) {

			System.out.print(fibo(i) + " ");

		}

	}

	public static int fibo(int n) {

		if (n <= 1)

			return n;

		else

			return fibo(n - 2) + fibo(n - 1);

	}

}
