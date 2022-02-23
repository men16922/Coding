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
			Person tmp = queue.poll(); // ť�� ���� ù ��° ���
			for(Person x : queue) { // queue�� �ִ� ��� Person ��ü loop 
				if(x.priority > tmp.priority) { // �� Person�� priority�� ���� ����޴� Person�� priority���� ũ��
					queue.offer(tmp); // ���� ����� �켱������ �����Ƿ� �� �ڷ� �̵�
					tmp = null; // �ڽź��� �켱������ ��������� ������ tmp = null
					break;
				}
			}
			
			if(tmp != null) { // �ڱ⺸�� �켱������ ���� ����� ������ �������
				answer++; // ���� ���� + 1
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
