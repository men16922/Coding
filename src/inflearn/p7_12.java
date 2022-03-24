package inflearn;

import java.util.Scanner;

/**
 * 경로 탐색(인접행렬)
 * @author men16
 *
 */
public class p7_12 {
	static int n, m, answer = 0;
	static int[][] graph;
	static int [] ch;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i = 1; i <= n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		p7_12 T = new p7_12();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt(); // node의 개수
		m = kb.nextInt(); // 간선의 개수
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			graph[a][b] = 1; // a에서 b로 간다(방향 그래프)
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
