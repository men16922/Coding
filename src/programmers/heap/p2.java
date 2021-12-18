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
		 * 대기 큐에 요청 시간을 기준으로 오름차순 정렬
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
     	 * 현재 시간 이하의 요청시간을 가지는 작업을 모두 대기큐에 작업 큐로 옮긴다
     	 * 작업 큐는 작업시간을 기준으로 오름차순 정렬되어있다.
     	 */
     	while(cnt < jobs.length) {
     		while(!waiting.isEmpty() && waiting.peek().requestTime <= time) {
     			pq.offer(waiting.pollFirst());
     		}
     		
     		if(!pq.isEmpty()) {
     			Job job = pq.poll();
     			time += job.workingTime; // 현재 시간에 현재 작업의 작업시간을 더해준다.
     			answer += time - job.requestTime; // 각 작업의 Turn Arround Time을 더한다.
     			cnt++;
     		} else {
     			time++; // 작업 큐가 비어있으면 현재 시간을 +1 한다.
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
