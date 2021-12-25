package bakjoon;

import java.util.Scanner;

public class P_2577 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		sc.nextLine();
		int second = sc.nextInt();
		sc.nextLine();
		int third = sc.nextInt();
		sc.nextLine();
		
		sc.close();
		String result = Integer.toString(first * second * third);
		char [] cArray = result.toCharArray();
		
		for(int i = 0 ; i < 10 ; i++) {
			int cnt = 0;
			for(int j = 0; j < cArray.length; j++) {
				if(Character.getNumericValue(cArray[j]) == i) {
					cnt++;
				}
							
			}
			System.out.println(cnt);
		}

	}
	

	
}
