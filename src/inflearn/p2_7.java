package inflearn;

import java.util.Scanner;

public class p2_7 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    
	    int cnt = 0;
	    int answer = 0;
	    for(int i = 0; i < n; i++) {
	    	int input = in.nextInt();
	    	if(input == 1) {
	    		cnt +=1;
	    		answer += cnt;
	    	} else {
	    		cnt = 0;
	    	}
	    }
	    
	    System.out.println(answer);
	    return ;
	  }
}
