package inflearn;

import java.util.Scanner;

public class p10 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String s = in.next();
	    char t = in.next().charAt(0);
	    
	    int p = 1000; // s의 각 문자와 t의 거리
	    

	    int [] answer = new int [s.length()];
	    
	    for(int i = 0; i < s.length(); i++) {
	    	if(s.charAt(i) == t) {
	    		p = 0;
	    		answer[i] = p;
	    	} else {
	    		p++;
	    		answer[i] = p;
	    	}
	    	
	    }
	    
	    p = 1000;
	    for(int i = s.length()-1; i >= 0; i--) {
	    	if(s.charAt(i) == t) {
	    		p = 0;
	    	} else {
	    		p++;
	    		answer[i] = Math.min(answer[i], p);
	    	}
	    }
	    
	    for(int a : answer) {
	    	System.out.print(a + " ");
	    }
	    
	  }
	
}
