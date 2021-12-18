package inflearn;

import java.util.Scanner;

public class p12 {

	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    
	    String input = in.next();

	    String answer = "";
	    for(int i = 0; i< n; i++) {
	    	String tmp = input.substring(0, 7).replace('#', '1').replace('*', '0');
	    	int num = Integer.parseInt(tmp, 2);
	    	answer+=(char)num;
//	    	System.out.println(tmp + " " + (char) num);
	    	input=input.substring(7);
	    }
	    
	    System.out.println(answer);
	    return ;
	  }
	
}
