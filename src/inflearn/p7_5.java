package inflearn;

/**
 * 이진트리 순회(깊이우선탐색)
 * ---------------
 * 		부
 * 왼		오
 * ----------------
 * ->이진트리 기본 구성
 * 전위순회 : 부 -> 왼 -> 오
 * 중위순회 : 왼 -> 부 -> 오
 * 후위순회 : 왼 -> 오 -> 부
 * @author men16
 *
 */

class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class p7_5 {
	
	Node root;
	
	
	
	/*
	 * 중이 순회
	 * stack 순서. 100=1
	 * D(100) -> D(200) -> D(400) -> null -> 종료하고 pop. D(400)으로 이동
	 * 4 출력후 rt가 null이기때문에 pop. 400 종료
	 * D(200) -> D(500) -> null -> pop
	 * D(500) pop -> 5 출력
	 * D(200) -> pop -> 2 출력
	 */
	public void DFS(Node root) {
		if(root == null) return;
		else {
//			System.out.print(root.data + " "); // 전위 순회
			DFS(root.lt);
//			System.out.print(root.data + " "); // 중위 순회
			DFS(root.rt);
			System.out.print(root.data + " "); // 후위 순회
		}
	}
	
	public static void main(String[] args) {
		p7_5 tree = new p7_5();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
}
