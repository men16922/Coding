package inflearn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    String input = in.next();
	    
	    char [] cArray = input.toCharArray();
	    String answer = "";
	    for(int i = 0; i < cArray.length; i++) {
	    	
	    	if(cArray[i] >= 48 && cArray[i] <= 57) {
//	    		System.out.println(cArray[i]);
	    		answer += Character.toString(cArray[i]);
	    	}
	    }
       System.out.println(Integer.parseInt(answer));
	}
}
