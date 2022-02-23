package inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
	public int start;
	
	public int end;

	public Meeting(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Meeting o) {
		// TODO Auto-generated method stub
		
		if(this.end == o.end) return this.start - o.start; // 끝나는 시간이 같으면 시작 시간으로 정렬
		return this.end - o.end; // 자신과 매개변수의 값의 차이
		// 양수면 1, 같으면 0, 작으면 -1
	} 
}


public class p9_2 {
	
	public int solution(List<Meeting> meetings) {
		
		Collections.sort(meetings); // 오름차순 정렬
		
		int cur = 0;
		
		List<Meeting> ans = new ArrayList<>();
		
		for(Meeting meet : meetings) { 
//			System.out.println(meet.start);
			if(cur <= meet.start) {
				cur = meet.end;
				ans.add(meet);
			}
		}
		
		
		return ans.size();
		
	}
	
	public static void main(String[] args) {
		p9_2 T = new p9_2();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Meeting> meetings = new ArrayList<>();
		
		
		for(int i = 0; i < n; i++) {
			
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			Meeting meeting = new Meeting(start, end);
			
			meetings.add(meeting);
		}
		
		System.out.println(T.solution(meetings));

	}
}
