package inflearn;

public class p7_1 {
	
	public void DFS(int n) {
		if(n == 0 ) {
			return;
		} else {
			DFS(n-1);
			System.out.print(n + " "); // �����������̱� ������ D(3) -> 2 -> 1 -> 0 ���� ���δ�
			// ��Ͱ� ������ ���� stack�� ��ܺ��� pop �ȴ�.
		}
	}
	
	public static void main(String[] args) {
		p7_1 T = new p7_1();
		T.DFS(3);
	}
}
