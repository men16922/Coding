package inflearn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * �׷��� �ִܰŸ�(BFS)
 * @author men16
 *
 */
public class p7_14 {

	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int [] ch, dis;
	
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv = queue.poll(); // ��������
			for(int nv : graph.get(cv)) { // ��������Ʈ
				if(ch[nv] == 0) {
					ch[nv] = 1;
					queue.offer(nv);
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	} 
	
	public static void main(String[] args) {
		p7_14 T = new p7_14();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // node�� ����
		m = kb.nextInt(); // ������ ����
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < m; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}

		T.BFS(1);
		for(int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
}
