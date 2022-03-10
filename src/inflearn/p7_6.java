package inflearn;

/**
 * 부분집합 구하기(DFS)
 * @author men16
 *
 */
public class p7_6 {
	
	static int n; // 부분집합 개수
	static int [] ch;
	
	public void DFS(int L) {
		if(L == n + 1) {
			String tmp = "";
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 1) tmp += i + " ";
			}
			if(tmp.length() > 0) // 길이가 0이면 공집합
				System.out.println(tmp);
			
		} else {
			ch[L] = 1; // 사용한다
			DFS(L+1); // 왼쪽
			ch[L] = 0; // 사용하지 않는다
			DFS(L+1); // 오른쪽
		}
	}
	
	public static void main(String[] args) {
		p7_6 T = new p7_6();
		
		n = 3;
		
		ch = new int[n+1];
		T.DFS(1);
	}
}
