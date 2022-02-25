package inflearn;

import java.util.Scanner;

public class p9_6 {

	static int [] unf; // ����, unf �迭�� �ε����� �л���ȣ
	// �迭�� ���� ���� ��ȣ
	
	
	public static int Find(int v) {
		if(v==unf[v]) return v; // v�� �л��� ���� ��ȣ
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a); 
		int fb = Find(b);
		if(fa != fb) unf[fa] =fb;
	}
	
	// ���� 1�� �л��� ���չ�ȣ 2, 2�� �л��� ���չ�ȣ 3
	// 1�� 2�� ���� �ٸ��Ƿ�, unf[1]�� 2���� �ִ´�
	// 1���� 2�� �л��� ���� �����̴�
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		
		unf = new int[n+1];
		for(int i = 1; i <= n; i++) unf[i] = i; // ���� ���� �ٸ� ���չ�ȣ�� �ʱ�ȭ
		for(int i = 1; i <= m; i++) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			Union(a, b); // a�� b�� �� ����, ģ������� �����
		}
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		int fa = Find(a);
		int fb = Find(b);
		if(fa==fb) System.out.println("YES");
		else System.out.println("NO");
	
	}
}
