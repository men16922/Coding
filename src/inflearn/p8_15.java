package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 피자 배달 거리(DFS)
 * @author men16
 *
 */
class Point{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}

public class p8_15 {
	
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int [] combi;
	static ArrayList<Point> hs, pz; // 집, 피자집 좌표
	
	public void DFS(int L, int s) {
		if(L == m) {
			int sum = 0; // 해당 조합의 경우에서 피자 배달 거리
			for(Point h : hs) { // 모든 집의 좌표를 loop
				int dis = Integer.MAX_VALUE; // 해당 집의 피자배달거리
				for(int i : combi) {
					// 집과 피자집 사이의 거리 계산, 그 중 최소 배달 거리
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) +  Math.abs(h.y - pz.get(i).y));
				}
				sum += dis; // 도시의 피자배달거리(각각의 집에서 피자집으로 최소배달거리를 더한 것)
			}
			answer = Math.min(answer, sum);
		} else {
			for(int i = s; i < len; i++) { // len 개 중 m개 조합 ㅗㅂ음
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		p8_15 T = new p8_15();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt(); // 살리려는 피자집의 개수
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) hs.add(new Point(i, j)); // 좌표가 집인 경우
				else if(tmp == 2) pz.add(new Point(i, j)); // 좌표가 피자집인 경우
			}
		}
		len = pz.size(); // 피자집의 개수
		combi = new int [m]; 
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
