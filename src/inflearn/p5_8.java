package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p5_8 {

	
	class Person{
		int id;
		int priority;
		public Person(int id, int priority) {
			this.id = id;
			this.priority = priority;
		}
	}
	
	public int solution(int n, int m, int [] arr) {
		int answer = 0;
		Queue<Person> queue = new LinkedList<>();
		
		for(int i = 0; i < arr.length; i++) {
			queue.offer(new Person(i, arr[i]));
		}
		
		
		while(!queue.isEmpty()) {
			Person tmp = queue.poll(); // 큐의 가장 첫 번째 요소
			for(Person x : queue) { // queue에 있는 모든 Person 객체 loop 
				if(x.priority > tmp.priority) { // 각 Person의 priority가 현재 진료받는 Person의 priority보다 크면
					queue.offer(tmp); // 현재 사람의 우선순위가 낮으므로 맨 뒤로 이동
					tmp = null; // 자신보다 우선순위가 높은사람이 있으면 tmp = null
					break;
				}
			}
			
			if(tmp != null) { // 자기보다 우선순위가 높은 사람이 없으면 진료받음
				answer++; // 현재 순서 + 1
				if(tmp.id == m) return answer;
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		p5_8 T = new p5_8();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}
