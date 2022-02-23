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
		// 양수면 1, 같으면 0, 작으면 -1
	} 
}


public class p9_3 {
	
	public int solution(List<Time> meetings) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(meetings); // 알파벳으로 오름차순 정렬
		
		int cnt = 0; // 현재 몇명 존재하는지
		
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
			
			int st = sc.nextInt(); // 오는 시간
			int et = sc.nextInt(); // 가는 시간
			
			meetings.add(new Time(st, 's'));
			meetings.add(new Time(et, 'e'));
		}
		
		System.out.println(T.solution(meetings));

	}
}