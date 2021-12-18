package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    String input = in.next();
	    char [] inputArr = input.toCharArray();
	    
	    ArrayList<Character> arr = new ArrayList<>();
	    
	    for(int i = 0; i < inputArr.length; i++) {
	    	if(!arr.contains(inputArr[i]))
	    		arr.add(inputArr[i]);
	    }
	    
	    for(char c : arr) {
	    	System.out.print(c);
	    }
	}
}
