package inflearn;

import java.util.Scanner;

public class p2_1 {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int input1 = in.nextInt();

	    String[] array = new String [input1];
	    for(int i = 0; i < array.length; i++) {
	    	array[i] = in.next();
	    }
	    int cnt = 0;
	    String answer = "";
	    
	    for(int i = 0; i < input1; i++) {
	    	if(Integer.parseInt(array[i]) > cnt) {
//	    		System.out.println(array[i]);
	    		answer += array[i] + " ";
	    	}
	    	cnt = Integer.parseInt(array[i]);
	    }
	    
	    System.out.println(answer);
	    return ;
	  }
}
