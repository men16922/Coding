package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class p_report {
	public int[] solution(String[] id_list, String[] report, int k) {
		
		List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
		// �ߺ�����, �迭�� list�� ��ȯ
		HashMap<String, Integer> count = new HashMap<>();
		for(String s : list) {
			String target = s.split(" ")[1]; // �Ű���� ���
			System.out.println(target);
			count.put(target, count.getOrDefault(target, 0) + 1); // �Ű���� ����� �Ű���� Ƚ��
		}
		
        return Arrays.stream(id_list).map(_user -> {
        	final String user = _user;
        	List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList()); // �Ű��� ����Ʈ
        	return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count(); // �Ű��ڰ� �Ű��� Ƚ���� kȸ �̻��� ������ count
        }).mapToInt(Long::intValue).toArray(); // int value ���·� return
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
