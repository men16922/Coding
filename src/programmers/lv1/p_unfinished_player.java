package programmers.lv1;

import java.util.HashMap;

public class p_unfinished_player {
	public String solution(String[] participant, String[] completion) {
          
        HashMap<String, Integer> map = new HashMap<>();
        
        /**
         * count table
         * 동명이인일 경우의 숫자를 센다
         */
        for(String player : participant) {
        	map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        /**
         * 이름이 나올 떄마다 count를 빼 준다
         */
        for(String player : completion) {
        	map.put(player, map.get(player) - 1);
        }
        
        for(String s : map.keySet()) {
        	if(map.get(s) != 0) {
        		return s;
        	}
        }
        
        return "";
    }
	
	public static void main(String[] args) {
		
		p_unfinished_player p = new p_unfinished_player();		
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		System.out.println(p.solution(participant, completion));
	}
}
