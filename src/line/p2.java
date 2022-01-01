package line;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p2 {
	public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String [] tArray = input.split(" ");
        
        String answer = "";
        int cur = 0;
        int sum = 0;
        boolean check = true;
        
        List<Integer> lList = new ArrayList<>();
//        System.out.println(tArray.length);
        for(int i = 0; i < tArray.length; i++) {
        	if(Integer.parseInt(tArray[i]) < - 200 ||Integer.parseInt(tArray[i]) > 200) {
        		answer = "ERROR";
        		check = false;
        		break;
        		
        	} else if((cur == 1 && tArray.length == 2 && Math.abs(Integer.parseInt(tArray[cur - 1]) - Integer.parseInt(tArray[cur])) >= 3) // 전 값 - 현재 값
        			)   {
        		check = false;
        		answer = "ERROR";
        		break;
        	} else if (!(cur > 1 && (Math.abs(Integer.parseInt(tArray[cur - 1]) - Integer.parseInt(tArray[cur])) >= 3)
        					&& (Math.abs(Integer.parseInt(tArray[cur - 2]) - Integer.parseInt(tArray[cur])) >= 3))) {
//        		lList
        	}
   
        	else {
        		sum += Integer.parseInt(tArray[i]);
//        		System.out.println(sum);
        	}
        	
    		cur ++;
        }
        
//        System.out.println(check);
        if(check == true) {
        	System.out.println((float) sum / tArray.length);
        } else if (check == false){
        	System.out.println(answer);
        }
        
    }
}
