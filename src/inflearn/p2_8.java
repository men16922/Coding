package inflearn;

import java.util.Scanner;

public class p2_8 {
	
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    
	    int [] arr = new int [n];
	    for(int i = 0; i < n; i++) {
	    	int input = in.nextInt();
	    	arr[i] = input;
	    }
	    
	    int [] answer = new int [n];
	    for(int i = 0; i < n; i++) {
	    	int cnt = 1 ;
	    	for(int j = 0; j < n; j++) {
		    	if(arr[j] > arr[i]) {
		    		cnt++;
		    	}
		    	answer[i] = cnt;
		    }
	    }
	    
	    for(int x : answer) {
	    	System.out.print(x + " ");
	    }
	    return ;
	  }
}
