package bakjoon;

import java.util.Scanner;

public class p_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m - 45 < 0) {
			h = h - 1;
			m = 60 + (m - 45);
			if(h < 0) {
				h = 23;
			}

		} else {
			m = m - 45;
			
		}
		
		
		System.out.print(h + " " + m);
		
	}
}
