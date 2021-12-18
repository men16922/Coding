package naverfinancial;

import java.util.Arrays;
import java.util.HashMap;

public class p1 {
	public static int solution(String[] id_list, int k) {
        int answer = 0; // ���鿡�� ���޵� ���� ����
        // id_list�� ��¥�� ������ �� ����Ʈ
        // k�� ���� �� �ִ� �ִ� ���� ����
        
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
