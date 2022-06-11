package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class h_dayOfProgrammer {
	
	public static String dayOfProgrammer(int year) {
		
		String day = "13"; // 기본은 13일
		
		/**
		 * 13일이 아닌 경우
		 * 1. 1918년일 경우
		 */
	    if(year == 1918) day = "26";
	    // 2. 윤년일 경우
	    else if(year < 1918 && year % 4 == 0) {
	    	day = "12";
	    } else if(year > 1918)
	    	if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
	    		day = "12";
	    	}
	    
	    return day + ".09." + Integer.toString(year);
	    } 
		
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
