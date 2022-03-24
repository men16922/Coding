package naverfinancial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class p2_0319 {

	public int[] solution(String s, String[] times) {
        
        String [] split = s.split(":");
		
        int firstday = Integer.parseInt(split[2]);
        
		int year = Integer.parseInt(split[0]);
		int month = Integer.parseInt(split[1]);
		int day = Integer.parseInt(split[2]);
		int hour = Integer.parseInt(split[3]);
		int min = Integer.parseInt(split[4]);
		int sec = Integer.parseInt(split[5]);
		int checker = 1;
		for(String t : times) {
			
			int curday = day;
			split = t.split(":");
			sec = sec + Integer.parseInt(split[3]);
			if(sec >= 60) {
				sec = sec - 60;
				min++;
			}
			
			min = min + Integer.parseInt(split[2]);
			if(min >= 60) {
				min = min - 60;
				hour++;
			}
			
			hour = hour + Integer.parseInt(split[1]);
			if(hour >= 24) {
				hour = hour - 24;
				day++;
			}
			
			
			
			day = day + Integer.parseInt(split[0]);
			if(day - curday  > 1) {
				checker = 0;
			}
			
			if(day >= 30) {
				day = day - 30;
				month++;
			}
			
			if(month >= 12) {
				month = month - 12;
				year++;
			}
			
			System.out.println(year +":"+ month +":"+ day +":"+ hour +":"+ min +":"+ sec);
		}
		
		int[] answer = {checker , day - firstday + 1};
        return answer;
    }
	
	public static void main(String[] args) throws ParseException {
		p2_0319 T = new p2_0319();
		
		String dateStart = "2021:04:12:16:08:35";
		
		String [] times = {"01:06:30:00", "01:04:12:00"};
		
		for(int s : T.solution(dateStart, times)) {
			System.out.println(s);
		}
		
	}
	
	
}
