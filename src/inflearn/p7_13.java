package inflearn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ��� Ž��(��������Ʈ)
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
			for(int nv : graph.get(v)) { // v�� ArrayList
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
		n = kb.nextInt(); // node�� ����
		m = kb.nextInt(); // ������ ����
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
