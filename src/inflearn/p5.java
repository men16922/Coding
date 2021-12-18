package inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class p5 {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);

	    String input = in.next();
	    char [] array = input.toCharArray();
	    List<Character> charArray = new ArrayList<>();
	    
	    for(int i = 0; i < array.length; i++) {

	    	if(getType(String.valueOf(array[i]))) {
	    		charArray.add(array[i]);
	    		array[i]= ' ';
	    	}
	    }
	    Collections.reverse(charArray);
	    
	    int cnt = 0;
	    for(int i = 0; i < array.length; i++) {
	    	
	    	if(array[i] == ' ') {
	    		array[i] = charArray.get(cnt);
	    		cnt++;
	    	}
	    }
	    
	    System.out.println(String.valueOf(array));
	    return ;
	  }
	
	public static boolean getType(String word) {
        return Pattern.matches("^[a-zA-Z]*$", word);
    }



}
