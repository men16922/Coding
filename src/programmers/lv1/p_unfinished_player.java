package programmers.lv1;

import java.util.HashMap;

public class p_unfinished_player {
	public String solution(String[] participant, String[] completion) {
          
        HashMap<String, Integer> map = new HashMap<>();
        
        /**
         * count table
         * ���������� ����� ���ڸ� ����
         */
        for(String player : participant) {
        	map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        /**
         * �̸��� ���� ������ count�� �� �ش�
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
