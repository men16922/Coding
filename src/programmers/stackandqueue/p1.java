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
		list.add(time.poll()); // 제일 앞의 작업을 리스트에 추가
		while(time.size() != 0) { 
			if(time.peek() <= list.get(0)) { //가장 작은 값이 제일 앞의 작업보다 작거나 같은지
				list.add(time.poll()); // 작으면 제일 앞의 작업을 list에 더하기 
			} else { 
				answer_list.add(list.size()); // 아닐 경우 answer_list에 쌓인 list의 크기만큼 모아서 넣음
				list.clear();
				list.add(time.poll()); // 리스트 비우고 다음 작업 더하기
			}
		}
		
		answer_list.add(list.size()); // list.size는 한번에 수행되는 작업의 크기, 마지막 작업까지 answer_list에 더하기
		answer = new int[answer_list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = answer_list.get(i); // 순서대로 한 번에 몇개를 작업했는지가 들어가게 됨
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
