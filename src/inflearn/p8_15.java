package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ���� ��� �Ÿ�(DFS)
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
	static ArrayList<Point> hs, pz; // ��, ������ ��ǥ
	
	public void DFS(int L, int s) {
		if(L == m) {
			int sum = 0; // �ش� ������ ��쿡�� ���� ��� �Ÿ�
			for(Point h : hs) { // ��� ���� ��ǥ�� loop
				int dis = Integer.MAX_VALUE; // �ش� ���� ���ڹ�ްŸ�
				for(int i : combi) {
					// ���� ������ ������ �Ÿ� ���, �� �� �ּ� ��� �Ÿ�
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) +  Math.abs(h.y - pz.get(i).y));
				}
				sum += dis; // ������ ���ڹ�ްŸ�(������ ������ ���������� �ּҹ�ްŸ��� ���� ��)
			}
			answer = Math.min(answer, sum);
		} else {
			for(int i = s; i < len; i++) { // len �� �� m�� ���� �Ǥ���
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		p8_15 T = new p8_15();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt(); // �츮���� �������� ����
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int tmp = kb.nextInt();
				if(tmp == 1) hs.add(new Point(i, j)); // ��ǥ�� ���� ���
				else if(tmp == 2) pz.add(new Point(i, j)); // ��ǥ�� �������� ���
			}
		}
		len = pz.size(); // �������� ����
		combi = new int [m]; 
		T.DFS(0, 0);
		System.out.println(answer);
	}
}
