package inflearn;

import java.util.Scanner;

public class p7_3 {

	public int DFS(int n) {
		if(n == 1) return 1;
		else return n * DFS(n - 1);
		/**
		 * D(5) = 5 * D(4)
		 * D(4) = 4 * D(3)
		 * D(3) = 3 * D(2)
		 * D(2) = 2 * D(1)
		 * D(1) = 1
		 * 
		 * ���� �����ӿ� 5 -> 4 -> 3 -> 2 -> 1 ������ ����
		 * 
		 */
	}
	
	public static void main(String[] args) {
		p7_3 T = new p7_3();
		System.out.println(T.DFS(5));
	}
}
