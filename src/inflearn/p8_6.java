package inflearn;

import java.util.Scanner;

/**
 * 순열 구하기
 * @author men16
 *
 */
public class p8_6 {

	static int [] pm, ch, arr;
	static int n, m;
	
	/**
	 * D(0)에서 시작, ch 배열은 0 0 0, pm은 비어있음
	 * 최초 arr[0] 사용, ch[0] = 1 (사용) 표시, pm[0] = arr[0], D(1)로 넘어감
	 * ch[0]은 사용했으므로, pm[1] = arr[1] 사용, ch[1] = 1, D(2), stack에서 pop
	 * D(1), i = 1으로 돌아옴, ch[1] = 0 으로 되돌린다
	 * for문에 따라 i = 2, ch[2] = 1, pm[1] = arr[2], D(2), stack에서 pop
	 * D(1), i = 2 로 돌아옴, ch[2] = 0으로 되돌림, stack에서 pop
	 * D(0)으로 되돌림, ch[0] = 0으로 되돌림
	 * D(0)에서 i = 1인 상태, 
	 * D(1), pm[0] = arr[1], D(2)로 넘어가면서 stack에서 pop
	 * ...
	 * @param L
	 */
	public void DFS(int L) {
		if(L == m) { // 순열이 만들어짐
			for(int x : pm) System.out.print(x + " ");
				System.out.println();
		} else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) { // check의 i번째 index가 사용되지 않았을 때
					ch[i] = 1;
					pm[L] = arr[i]; // 순열의 값 세팅
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		p8_6 T = new p8_6();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		m = kb.nextInt();
		arr = new int[n];
		for(int i = 0 ; i < n; i++) arr[i] = kb.nextInt();
		ch = new int[n];
		pm = new int[m];
		
		T.DFS(0);
	}
}
