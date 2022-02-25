package inflearn;

import java.util.Scanner;

public class p9_6 {

	static int [] unf; // 집합, unf 배열의 인덱스는 학생번호
	// 배열의 값은 집합 번호
	
	
	public static int Find(int v) {
		if(v==unf[v]) return v; // v번 학생의 집합 번호
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a); 
		int fb = Find(b);
		if(fa != fb) unf[fa] =fb;
	}
	
	// 최초 1번 학생의 집합번호 2, 2번 학생의 집합번호 3
	// 1과 2가 서로 다르므로, unf[1]에 2값을 넣는다
	// 1번과 2번 학생은 같은 집합이다
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		unf = new int[n+1];
		for(int i = 1; i <= n; i++) unf[i] = i; // 최초 각자 다른 집합번호로 초기화
		for(int i = 1; i <= m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			Union(a, b); // a와 b를 한 집합, 친구관계로 만든다
		}
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		int fa = Find(a);
		int fb = Find(b);
		if(fa==fb) System.out.println("YES");
		else System.out.println("NO");
	
	}
}
