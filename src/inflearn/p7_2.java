package inflearn;

public class p7_2 {
	
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n % 2 + ""); // ���ڸ� �Ź� 2�� ���� ������
			// ������ �׾Ƽ� pop
			// D(1) -> 6���� -> 1
			// D(2) -> 6���� -> 0
			// D(5) -> 6���� -> 1
			// D(11) -> 6���� -> 1
			// ���ÿ� �׿���, ���κ��� pop
		}
	}
	
	public static void main(String[] args) {
		p7_2 T = new p7_2();
		T.DFS(11);
	}
}
