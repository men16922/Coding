package inflearn;

import java.util.Scanner;

public class p7 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    String input = in.next();
	    
	    char [] reverse = input.toLowerCase().toCharArray();
	    String answer = "";
	    for(int i = reverse.length - 1; i >=0; i--) {
	    	answer += Character.toString(reverse[i]);
	    }
	    
	    if(input.toLowerCase().equals(answer)) {
	    	System.out.println("YES");
	    } else {
	    	System.out.println("NO");
	    }
	}
}
