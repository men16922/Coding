package inflearn;

public class p7_1 {
	
	public void DFS(int n) {
		if(n == 0 ) {
			return;
		} else {
			DFS(n-1);
			System.out.print(n + " "); // 스택프레임이기 떄문에 D(3) -> 2 -> 1 -> 0 으로 쌓인다
			// 재귀가 끝나는 순간 stack의 상단부터 pop 된다.
		}
	}
	
	public static void main(String[] args) {
		p7_1 T = new p7_1();
		T.DFS(3);
	}
}
