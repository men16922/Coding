package inflearn;

import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    String input = in.nextLine();
	    
	    String origin = convert(input.toLowerCase());
	    char [] reverse = origin.toCharArray();
	    String answer = "";
	    for(int i = reverse.length - 1; i >=0; i--) {
	    	answer += Character.toString(reverse[i]);
	    }
	    if(origin.equals(answer)) {
	    	System.out.println("YES");
	    } else {
	    	System.out.println("NO");
	    }
	}
	
	public static String convert(String input) {
		char [] convertText = input.toCharArray();
		String answer = "";
		for(int i = 0; i < convertText.length; i++) {
			if(convertText[i] >= 91 && convertText[i] <=123) {
				answer += Character.toString(convertText[i]);
			} 
		}
		return answer;
		
	}
}
