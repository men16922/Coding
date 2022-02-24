package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * ���ͽ�Ʈ�� �˰���
 * @author men16
 *
 */

class Edge implements Comparable<Edge> {
	public int vex; // ����
	public int cost; // ������ ����ġ��
	
	Edge(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost; // ��������, ���� ���� �� �켱
	}
}

public class p9_5 {

	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int [] dis;
	
	public void solution(int v) {
		PriorityQueue<Edge> pQ = new PriorityQueue<Edge>();
		pQ.offer(new Edge(v, 0));
		
		dis[v] = 0;
		
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int now = tmp.vex; // ����
			int nowCost = tmp.cost; // �������� ���� �� ��� ���
			
			if(nowCost > dis[now]) continue;
			for(Edge ob : graph.get(now)) {
				if(dis[ob.vex] > nowCost + ob.cost) {
					dis[ob.vex] = nowCost + ob.cost;
					pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
				}
			}
		}
		
		// dis[1] = 0;
		
		// ���� now = 1�϶�, ob.vex = 2, ob.cost = 12
		// ob.vex=2�϶� nowCost = 0�� 12�� ���Ѵ�
		// pQ�� (2,12)�� �ִ´�.
		
		// dis[2] = 12;
		
		/**
		 * �� ���� ob.vex = 3, ob.cost = 4
		 * dis[3]�� Max���̹Ƿ� nowCost = 0 + 4(cost)�� ���ؼ� 4
		 * pQ�� (3,4)�� �ִ´�.
		 * 
		 * dis[3] = 4;
		 * 
		 * -> 1���� 2�� ���� ���µ� ��� 12, 1���� 3�� ���� ���µ� 4
		 * while�� ó������ ���� poll �ϸ� cost ����� ���� ���� (3,4)�� ���´�
		 * ���� now = 3, nowCost = 4�� �ȴ�.
		 * 
		 * ob.vex = 3, nowCost = 4, ob.cost = 5
		 * dis[4] = 9;
		 * 
		 * ob.vex = 4, ob.cost = 0;
		 * poll �ϸ� (4,9)�� ����
		 * 
		 * now = 4 , nowCost = 9;
		 * 
		 * 4�������� 2, 5�� ����
		 * 
		 * ob.vex = 2, ob.cost = 2;
		 * 
		 * dis[2] = 2 + 9 = 11;
		 * 
		 * pQ�� (2,11) offer
		 * 
		 * ob.vex =5 , ob.cost = 5
		 * 
		 * pQ�� (5, 14) offer
		 * 
		 * poll�ϸ� ���� ���� �� (2,12) �� ���´�
		 * 
		 * 2���� ������� dis[]�� ����� ������ �۾����� �ʴ´�.
		 * 
		 * �� ���� poll �ϸ� (2,12), (2,11)���� ���� �� ����, ����� �ʿ� ������ continue
		 */
		
	}
	
	
	public static void main(String[] args) {
		p9_5 T = new p9_5();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		
		graph = new ArrayList<ArrayList<Edge>>();
		
		for(int i = 0; i <= n; i++) { // 0������ n������
			//Edge��� Ŭ���� ��ü�� �����ϴ� ArrayList�� �����ϴ� ArrayList
			graph.add(new ArrayList<Edge>());
		}
		
		dis = new int[n+1];
		Arrays.fill(dis,  Integer.MAX_VALUE);
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b, c)); // a��° ArrayList�� b,c���� ���� Edge ��ü�� �ִ´�
			// i��° arrayList�� �ִ� Edge ��ü��
		}
		
		T.solution(1);
		
		for(int i = 2; i <= n; i++) {
			if(dis[i]!= Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
			else System.out.println(i + " : impossible");
		}
	}
}
 