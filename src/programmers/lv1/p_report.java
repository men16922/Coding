package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class p_report {
	public int[] solution(String[] id_list, String[] report, int k) {
		
		List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
		// 중복제거, 배열을 list로 변환
		HashMap<String, Integer> count = new HashMap<>();
		for(String s : list) {
			String target = s.split(" ")[1]; // 신고당한 대상
			System.out.println(target);
			count.put(target, count.getOrDefault(target, 0) + 1); // 신고당한 대상의 신고받은 횟수
		}
		
        return Arrays.stream(id_list).map(_user -> {
        	final String user = _user;
        	List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList()); // 신고자 리스트
        	return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count(); // 신고자가 신고한 횟수가 k회 이상인 유저를 count
        }).mapToInt(Long::intValue).toArray(); // int value 형태로 return
    }
	
	public static void main(String[] args) {
		
		p_report p = new p_report();
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		
		int k=2;
		
		int [] answer = p.solution(id_list, report, k);
		
		for(int i = 0; i< answer.length; i++) {
			
			if(i == answer.length - 1) {
				System.out.print(answer[i]);
			} else {
				System.out.print(answer[i] + ",");
			}
			
		}
	}
}
