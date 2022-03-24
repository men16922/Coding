package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 경로 탐색(인접리스트)
 * @author men16
 *
 */
public class p7_13 {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int [] ch;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) { // v번 ArrayList
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		p7_13 T = new p7_13();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // node의 개수
		m = kb.nextInt(); // 간선의 개수
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < m; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
