package programmers.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class p1 {

	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		
		Queue<Integer> time = new LinkedList<>();
		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> answer_list = new LinkedList<>();
		
		for(int i = 0; i < progresses.length; i++) {
			int count = divide(100 - progresses[i], speeds[i]);
			time.add(count);
		}
		list.add(time.poll()); // ���� ���� �۾��� ����Ʈ�� �߰�
		while(time.size() != 0) { 
			if(time.peek() <= list.get(0)) { //���� ���� ���� ���� ���� �۾����� �۰ų� ������
				list.add(time.poll()); // ������ ���� ���� �۾��� list�� ���ϱ� 
			} else { 
				answer_list.add(list.size()); // �ƴ� ��� answer_list�� ���� list�� ũ�⸸ŭ ��Ƽ� ����
				list.clear();
				list.add(time.poll()); // ����Ʈ ���� ���� �۾� ���ϱ�
			}
		}
		
		answer_list.add(list.size()); // list.size�� �ѹ��� ����Ǵ� �۾��� ũ��, ������ �۾����� answer_list�� ���ϱ�
		answer = new int[answer_list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = answer_list.get(i); // ������� �� ���� ��� �۾��ߴ����� ���� ��
		}
		
        return answer;
    }
	
	public int divide(int dividend, int divisor) {
		if(dividend%divisor == 0) {
			return dividend/divisor;
		} else {
			return dividend/divisor + 1;
		}
	}
	
	public static void main(String[] args) {
		
		int [] progresses = {93, 30, 55};
		int [] speeds = {1, 30, 5};
		
		int [] solution = solution(progresses, speeds);
		
		for(int i = 0 ; i < solution.length; i++) {
			System.out.println(solution[i]);
		}
	}
}
