package bakjoon;

import java.util.Scanner;

/**
 * 크로아티아 알파벳
 * @author men16
 *
 */
public class p_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		String[] croatia = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String text = sc.nextLine();
		
		for(int i = 0; i < croatia.length; i++){
			if(text.contains(text))
				text = text.replace(croatia[i], "!");
		}
//		System.out.println(text);
		System.out.println(text.length());
	}
}
