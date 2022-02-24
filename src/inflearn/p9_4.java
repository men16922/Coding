package inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lesson implements Comparable<Lesson>{
	public int profit;
	
	public int day;

	public Lesson(int profit, int day) {
		super();
		this.profit = profit;
		this.day = day;
	}
	
	public int compareTo(Lesson o) {
		// TODO Auto-generated method stub
		return o.day - this.day; // �������� ����
		// ����� 1, ������ 0, ������ -1
	} 
}

public class p9_4 {

	public static int solution(List<Lesson> lessons, int max) {
		
		int maxProfit = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		
		Collections.sort(lessons); // ��¥�� ū�ͺ��� ����
		
		int j = 0;
		for(int i = max; i >= 1; i--) {
			for( ; j < lessons.size(); j++) {
				if(lessons.get(j).day < i) break;
				pQ.offer(lessons.get(j).profit);
			}
			if(!pQ.isEmpty()) maxProfit += pQ.poll(); // �켱���� ť�� ���� ū �� ���Ѵ�
		}
		
		return maxProfit;

	}
	
	public static void main(String[] args) {
		p9_4 T = new p9_4();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Lesson> lessons = new ArrayList<>();
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			
			int st = sc.nextInt(); // ����
			int et = sc.nextInt(); // �ð�
			
			lessons.add(new Lesson(st, et));
			if(et > max) max = et;
		}
		
		System.out.println(T.solution(lessons, max));

	}
}
