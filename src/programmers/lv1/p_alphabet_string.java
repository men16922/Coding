package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class p_alphabet_string {
	
	public int solution(String s) {
        String[] numberToWords = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < numberToWords.length; i++) {
        	s = s.replaceAll(numberToWords[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }
	
	public static void main(String[] args) {
		p_alphabet_string p = new p_alphabet_string();
		
		String s = "onetwothreefour";
		
		System.out.println(p.solution(s));
	}
}
