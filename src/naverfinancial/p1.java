package naverfinancial;

import java.util.Arrays;
import java.util.HashMap;

public class p1 {
	public static int solution(String[] id_list, int k) {
        int answer = 0; // 고객들에게 지급된 쿠폰 개수
        // id_list는 날짜별 구매한 고객 리스트
        // k는 받을 수 있는 최대 쿠폰 개수
        
        HashMap<String, Integer> iMap = new HashMap<String, Integer>();
        
        for(int i=0; i< id_list.length; i++) {
        	
        	String [] list = id_list[i].split(" ");
        	list = Arrays.stream(list).distinct().toArray(String[]::new);

        	for(String s : list) {
        		iMap.put(s, iMap.getOrDefault(s, 0) + 1);
        	}
        	
        	
        }
        
        for(String key : iMap.keySet()) {
//        	System.out.println(key + "," + iMap.get(key));
        	int cnt = iMap.get(key);
        	if(cnt > k) {
        		cnt = k;
        	}
        	answer += cnt;
        }
        
        return answer; 
    }
	
	public static void main(String[] args) {
		String [] id_list = {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE", "MAY"};
		System.out.println(solution(id_list, 3));
	}
}
