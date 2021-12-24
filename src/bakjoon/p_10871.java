package bakjoon;

import java.util.Scanner;

public class p_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			int cur = sc.nextInt();
			if(cur < x) {
				System.out.print(cur + " ");
			}
		}
		
	}
}
