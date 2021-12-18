package inflearn;

import java.util.Scanner;

public class p4 {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    String [] array = new String[num];
	    
	    
	    for(int i = 0; i < num; i++) {
	    	String input = in.next();
	    	StringBuffer sb = new StringBuffer(input);
	    	array[i] = sb.reverse().toString();
	    	System.out.println(array[i]);
	    }
	    
	    return ;
	  }
}
