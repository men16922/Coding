package inflearn;

import java.util.Scanner;

public class p2_2 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int input1 = in.nextInt();
	    
	    int cnt = 0;
	    
	    int [] arr = new int [input1];
	    for(int i = 0; i < arr.length; i++) {
	    	arr[i] = in.nextInt();
	    }
	    int count = 0;
	    for(int i = 0; i < arr.length; i++) {
	    	if(cnt < arr[i]) {
	    		count++;
	    		cnt = arr[i];
	    	}
	    }
	    
	    System.out.println(count);
	    return ;
	  }
}
