package inflearn;

/**
 * ����Ʈ�� ��ȸ(���̿켱Ž��)
 * ---------------
 * 		��
 * ��		��
 * ----------------
 * ->����Ʈ�� �⺻ ����
 * ������ȸ : �� -> �� -> ��
 * ������ȸ : �� -> �� -> ��
 * ������ȸ : �� -> �� -> ��
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
	 * ���� ��ȸ
	 * stack ����. 100=1
	 * D(100) -> D(200) -> D(400) -> null -> �����ϰ� pop. D(400)���� �̵�
	 * 4 ����� rt�� null�̱⶧���� pop. 400 ����
	 * D(200) -> D(500) -> null -> pop
	 * D(500) pop -> 5 ���
	 * D(200) -> pop -> 2 ���
	 */
	public void DFS(Node root) {
		if(root == null) return;
		else {
//			System.out.print(root.data + " "); // ���� ��ȸ
			DFS(root.lt);
//			System.out.print(root.data + " "); // ���� ��ȸ
			DFS(root.rt);
			System.out.print(root.data + " "); // ���� ��ȸ
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
