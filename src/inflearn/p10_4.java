package inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 가장 높은 탑 쌓기
 * @author men16
 *
 */

class Brick implements Comparable<Brick> {
	public int s, h, w;
	Brick(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Brick o) {
		// TODO Auto-generated method stub
		return o.s - this.s;
	}
	
}


public class p10_4 {

	static int [] dy;
	
	public int solution(ArrayList<Brick> arr) {
		int answer = 0;
		Collections.sort(arr);
		dy[0] = arr.get(0).h; // 첫 번째, 가장 넓이가 넓은 벽돌의 높이
		answer = dy[0]; // 각자 벽돌을 하나씩 쌓는 경우에는 첫 번째가의 높이가 답이 된다.
		
		for(int i = 1; i < arr.size(); i++) {
			int max_h = 0;
			for(int j = i - 1; j >= 0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
					max_h = dy[j];
				}
			}
			
			dy[i] = max_h + arr.get(i).h;
			answer = Math.max(answer, dy[i]);
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		p10_4 T = new p10_4();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Brick> arr = new ArrayList<>();
		
		dy = new int [n];
		for(int i = 0; i < n; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			arr.add(new Brick(a, b, c));
		}
		System.out.println(T.solution(arr));
	}
}
