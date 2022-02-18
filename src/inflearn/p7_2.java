package inflearn;

public class p7_2 {
	
	public void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n % 2 + ""); // 숫자를 매번 2로 나눈 나머지
			// 스택을 쌓아서 pop
			// D(1) -> 6라인 -> 1
			// D(2) -> 6라인 -> 0
			// D(5) -> 6라인 -> 1
			// D(11) -> 6라인 -> 1
			// 스택에 쌓여서, 위로부터 pop
		}
	}
	
	public static void main(String[] args) {
		p7_2 T = new p7_2();
		T.DFS(11);
	}
}
