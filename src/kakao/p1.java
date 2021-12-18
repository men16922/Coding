package kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class p1 {

	public static int[] solution(String[] id_list, String[] report, int k) {
        
		LinkedHashSet<String> idSet = new LinkedHashSet<>();
		for(int i = 0; i < id_list.length; i++) {
			idSet.add(id_list[i]);
        }
		
		LinkedHashSet<String> reportSet = new LinkedHashSet<>();
		for(int i = 0; i < report.length; i++) {
			reportSet.add(report[i]);
        }
		
        List<String> reporterList = new ArrayList<>();
        List<String> reportedList = new ArrayList<>();
        
        
        
        
        for(String reporting : reportSet) {
        	int count = reporting.indexOf(" ");
        	reporterList.add(reporting.substring(0, count));
        	reportedList.add(reporting.substring(count + 1));
        }
        
        Map<String, Integer> reportedMap = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
        	reportedMap.put(id_list[i], 0);
        }  
        
        Map<String, Integer> reporterMap = new HashMap<>();
        
        for(int i = 0; i < reporterList.size(); i++) {
        	reporterMap.put(reporterList.get(i), 0);
        }
        

 
        for(String id : idSet) {
        	for(int j = 0; j < reportedList.size(); j++) {
        		if(id.equals(reportedList.get(j))){
        			int	count = reportedMap.get(id);
            		reportedMap.put(id, count + 1);

        		}
        	}
        }
        
        HashSet<String> mailSet = new HashSet<>();
        
        for(String key : reportedMap.keySet()) {
//        	System.out.println(key + " : " + reportedMap.get(key));
        	if(reportedMap.get(key) >= k) {
        		mailSet.add(key);
        	}
        }
        
        for(String key : reportedMap.keySet()) {
        	for(String mail : mailSet) {
        		if(key.equals(mail)) {
        			reporterMap.put(key, 1);
        		}
        	}
        }
        
        Map<String, Integer> answerMap = new HashMap<>();
        for(String id : idSet) {
        	System.out.println(id);
        	answerMap.put(id,  0);
        }
        
        for(int i = 0; i < reporterList.size(); i++) {
        	for(String mail : mailSet) {
        		if(reportedList.get(i).equals(mail)) {

        			answerMap.put(reporterList.get(i), answerMap.get(reporterList.get(i)) + 1);
        		}
        	}
        }
        
        
        int [] answer = new int [idSet.size()];
        
        int i = 0;
        for(String id : idSet) {
            for(String key : answerMap.keySet()) {
            	if(id.equals(key)) {
            		answer[i] = answerMap.get(key);
            	}
            }
            i++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		
		int k=2;
		
		int [] answer = solution(id_list, report, k);
		
		for(int i = 0; i< answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
