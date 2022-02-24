package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 다익스트라 알고리즘
 * @author men16
 *
 */

class Edge implements Comparable<Edge> {
	public int vex; // 정점
	public int cost; // 간선의 가중치값
	
	Edge(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost; // 오름차순, 가장 작은 값 우선
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
			int now = tmp.vex; // 정점
			int nowCost = tmp.cost; // 정점까지 가는 데 드는 비용
			
			if(nowCost > dis[now]) continue;
			for(Edge ob : graph.get(now)) {
				if(dis[ob.vex] > nowCost + ob.cost) {
					dis[ob.vex] = nowCost + ob.cost;
					pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
				}
			}
		}
		
		// dis[1] = 0;
		
		// 최초 now = 1일때, ob.vex = 2, ob.cost = 12
		// ob.vex=2일때 nowCost = 0에 12를 더한다
		// pQ에 (2,12)를 넣는다.
		
		// dis[2] = 12;
		
		/**
		 * 그 다음 ob.vex = 3, ob.cost = 4
		 * dis[3]은 Max값이므로 nowCost = 0 + 4(cost)를 더해서 4
		 * pQ에 (3,4)를 넣는다.
		 * 
		 * dis[3] = 4;
		 * 
		 * -> 1에서 2번 정점 가는데 비용 12, 1에서 3번 정점 가는데 4
		 * while문 처음으로 가서 poll 하면 cost 비용이 가장 작은 (3,4)가 나온다
		 * 따라서 now = 3, nowCost = 4가 된다.
		 * 
		 * ob.vex = 3, nowCost = 4, ob.cost = 5
		 * dis[4] = 9;
		 * 
		 * ob.vex = 4, ob.cost = 0;
		 * poll 하면 (4,9)가 나옴
		 * 
		 * now = 4 , nowCost = 9;
		 * 
		 * 4번에서는 2, 5로 간선
		 * 
		 * ob.vex = 2, ob.cost = 2;
		 * 
		 * dis[2] = 2 + 9 = 11;
		 * 
		 * pQ에 (2,11) offer
		 * 
		 * ob.vex =5 , ob.cost = 5
		 * 
		 * pQ에 (5, 14) offer
		 * 
		 * poll하면 가장 작은 값 (2,12) 이 나온다
		 * 
		 * 2에서 뻗어나가서 dis[]에 저장된 값보다 작아지지 않는다.
		 * 
		 * 그 다음 poll 하면 (2,12), (2,11)보다 작을 수 없고, 뻗어나갈 필요 없으니 continue
		 */
		
	}
	
	
	public static void main(String[] args) {
		p9_5 T = new p9_5();
		Scanner kb = new Scanner(System.in);
		
		n = kb.nextInt();
		m = kb.nextInt();
		
		graph = new ArrayList<ArrayList<Edge>>();
		
		for(int i = 0; i <= n; i++) { // 0번부터 n번까지
			//Edge라는 클래스 객체를 저장하는 ArrayList를 저장하는 ArrayList
			graph.add(new ArrayList<Edge>());
		}
		
		dis = new int[n+1];
		Arrays.fill(dis,  Integer.MAX_VALUE);
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			int c = kb.nextInt();
			graph.get(a).add(new Edge(b, c)); // a번째 ArrayList에 b,c값을 가진 Edge 객체를 넣는다
			// i번째 arrayList에 있는 Edge 객체들
		}
		
		T.solution(1);
		
		for(int i = 2; i <= n; i++) {
			if(dis[i]!= Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
			else System.out.println(i + " : impossible");
		}
	}
}
 