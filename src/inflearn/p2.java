package inflearn;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input1 = in.next();
	    System.out.println(convert(input1));
	  }
	
	public static String convert(String input) {
		char [] convertText = input.toCharArray();
		for(int i = 0; i < convertText.length; i++) {
			if(convertText[i] >= 91 && convertText[i] <=123) {
				convertText[i] = (char) (convertText[i] - 32);
			} else if(convertText[i] >= 65 && convertText[i] <=90) {
				convertText[i] = (char) (convertText[i] + 32);
			}
		}
		return String.valueOf(convertText);
		
	}
}
