package toss;

import java.text.DecimalFormat;

public class toss3 {
	 public static boolean solution(String amountText) {
	        boolean answer = false;
	        
	        String removeText = amountText.replaceAll(",", ""); // , Á¦°Å
//	        System.out.println(removeText);
	        boolean isNumeric =  removeText.matches("\\d*(\\.\\d+)?");
	        if(!isNumeric) {
	        	return false;
	        } 
	        
	        
//	        System.out.println(removeText);
	        DecimalFormat df = new DecimalFormat("###,###");
	        removeText = df.format(Integer.parseInt(removeText));
//	        System.out.println(removeText + "," +amountText);
	        if(removeText.replaceAll(",", "").equals(amountText))
	        {
	        	return true;
	        }
	        if(removeText.equals(amountText)) {
	        	return true;
	        }
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		String amountText = "	";
		System.out.println(solution(amountText));
	}
}
