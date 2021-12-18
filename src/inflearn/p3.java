package inflearn;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    String input1 = in.nextLine();
 
	    String [] array = input1.split(" ");
	    
	    String answer = "";
	    int len = 0;
	    for(String arr : array) {
	    	if(arr.length() > len) {
	    		len = arr.length();
	    		answer = arr;
	    	} else if (arr.length() == len) {
	    		if(answer.compareTo(arr) > 0) {
	    			answer = arr;
	    		}
	    	}
	    }
	    
	    System.out.println(answer);
	    return ;
	  }
	
}
