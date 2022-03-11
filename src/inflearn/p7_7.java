package inflearn;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 이진트리 순회
 * BFS(레벨 탐색)
 */

public class p7_7 {

	Node root;
	
	/*
	 * 최초 레벨0 1일때 1 꺼내고 2,3 추가
	 * 레벨 1일떄 2 꺼내고 4,5 추가, 3 꺼내고 6,7 추가
	 * 레벨 2일때 4,5,6,7 모두 자식이 없으니 출력
	 */
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0; // 레벨
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			for(int i = 0; i < len; i++) { // 레벨의 원소를 전부 돈다
				Node cur = Q.poll(); // 현재 노드
				System.out.print(cur.data + " ");
				if(cur.lt != null) Q.offer(cur.lt); // 왼쪽 노드 추가
				if(cur.rt != null) Q.offer(cur.rt); // 오른쪽 노드 추가
			} // 레벨 끝
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		p7_7 tree = new p7_7();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
	}
}
