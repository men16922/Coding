package inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time>{
	public int time;
	
	public char state;

	public Time(int time, char state) {
		super();
		this.time = time;
		this.state = state;
	}

	public int compareTo(Time o) {
		// TODO Auto-generated method stub
		
		if(this.time == o.time) return this.state - o.state;
		else return this.time - o.time;
		// ����� 1, ������ 0, ������ -1
	} 
}


public class p9_3 {
	
	public int solution(List<Time> meetings) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(meetings); // ���ĺ����� �������� ����
		
		int cnt = 0; // ���� ��� �����ϴ���
		
		for(Time ob : meetings) { 
//			System.out.println(ob.time + "," + ob.state);
			if(ob.state == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		p9_3 T = new p9_3();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Time> meetings = new ArrayList<>();
		
		
		for(int i = 0; i < n; i++) {
			
			int st = sc.nextInt(); // ���� �ð�
			int et = sc.nextInt(); // ���� �ð�
			
			meetings.add(new Time(st, 's'));
			meetings.add(new Time(et, 'e'));
		}
		
		System.out.println(T.solution(meetings));

	}
}