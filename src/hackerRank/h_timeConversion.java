package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class h_timeConversion {
	
	public static String timeConversion(String s){
	    // Write your code here
			SimpleDateFormat format = new SimpleDateFormat("hh:mm:ssaa");
			try {
				Date date = format.parse(s);
				
				format = new SimpleDateFormat("HH:mm:ss");
				
				return format.format(date);
			} catch(Exception e) {
				return null;
			}
			
			
	    }
	
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = bufferedReader.readLine();
        
        String result = timeConversion(s);

        bufferedReader.close();
        
        System.out.println(result);
    }
}

