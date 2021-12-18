package inflearn;
import java.util.Scanner;


public class p1 {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String input1 = in.next().toUpperCase();
	    char input2 = in.next().toUpperCase().charAt(0);
	    
	    char [] text = input1.toCharArray();
	    int cnt = 0;
	    for(int i = 0; i < text.length; i++) {
	    	if(text[i] == input2) {
	    		cnt++;
	    	}
	    }
	    
	    System.out.println(cnt);
	  }
}
