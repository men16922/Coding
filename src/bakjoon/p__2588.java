package bakjoon;

import java.util.Scanner;

/**
 * °ö¼À
 * @author men16
 *
 */
public class p__2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		
		int sLength = second.length();
		
		sc.close();
		System.out.println(Integer.parseInt(first) * Integer.parseInt(second.substring(sLength - 1)));
		System.out.println(Integer.parseInt(first) * Integer.parseInt(second.substring(sLength - 2, sLength - 1)));
		System.out.println(Integer.parseInt(first) * Integer.parseInt(second.substring(sLength - 3, sLength - 2)));
		System.out.println(Integer.parseInt(first) * Integer.parseInt(second));
	}
}
