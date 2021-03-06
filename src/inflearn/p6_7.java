package inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Point implements Comparable<Point>{
	public int x, y;
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		
		// this객체가 앞이고 o가 뒤면 오름차순, 반대이면 내림차순
		// 음수값이 return 되어야 함
		if(this.x == o.x ) return  this.y - o.y; //오름차순
		else return this.x - o.x;
	}
	
}

public class p6_7 {
	
	public static void main(String[] args) {
		p6_7 T = new p6_7();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		
		for(Point o : arr) System.out.println(o.x + " " + o.y);
		
		
	}
}
