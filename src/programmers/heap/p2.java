package programmers.heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class p2 {

	class Job {
		int requestTime;
		int workingTime;
		
		Job(int requestTime, int workingTime) {
			this.requestTime = requestTime;
			this.workingTime = workingTime;
		}
	}
	
	public int solution(int[][] jobs) {
		LinkedList<Job> waiting = new LinkedList<>();
		PriorityQueue<Job> pq = new PriorityQueue<>(new Comparator<Job>() {

			@Override
			public int compare(Job j1, Job j2) {
				return j1.workingTime - j2.workingTime;
			}
			
		});
		
		for(int[] job : jobs) {
    		waiting.offer(new Job(job[0], job[1]));
    	}
		/**
		 * ��� ť�� ��û �ð��� �������� �������� ����
		 */
		Collections.sort(waiting, new Comparator<Job>() {

			@Override
			public int compare(Job j1, Job j2) {
				return j1.requestTime - j2.requestTime;
			}
			
		});
		
        int answer = 0;
     	int cnt = 0;
     	int time = waiting.peek().requestTime;
     	
     	/**
     	 * ���� �ð� ������ ��û�ð��� ������ �۾��� ��� ���ť�� �۾� ť�� �ű��
     	 * �۾� ť�� �۾��ð��� �������� �������� ���ĵǾ��ִ�.
     	 */
     	while(cnt < jobs.length) {
     		while(!waiting.isEmpty() && waiting.peek().requestTime <= time) {
     			pq.offer(waiting.pollFirst());
     		}
     		
     		if(!pq.isEmpty()) {
     			Job job = pq.poll();
     			time += job.workingTime; // ���� �ð��� ���� �۾��� �۾��ð��� �����ش�.
     			answer += time - job.requestTime; // �� �۾��� Turn Arround Time�� ���Ѵ�.
     			cnt++;
     		} else {
     			time++; // �۾� ť�� ��������� ���� �ð��� +1 �Ѵ�.
     		}
     	}
     	return answer / cnt;
     		
    }
	
	public static void main(String[] args) {
		int [][] jobs = {{0,3},{1,9},{2,6}};
		p2 pe = new p2();
		
		System.out.println(pe.solution(jobs));
	}
}
