package bakjoon;

import java.util.Scanner;

/**
 * �м�ã��
 * @author men16
 *
 */
public class p_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		
		while (n > 0) {
			cnt ++;
			n -= cnt;
			
			if(cnt % 2 == 0) {
				System.out.println((cnt + n) + "/" + (1 - n));
				
			} else {
				System.out.println((1-n) + "/" + (cnt + n));
				
			}
		}
	}
}
