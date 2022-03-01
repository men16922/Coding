package inflearn;

/**
 * �Ǻ���ġ ���� - �޸������̼�
 * �迭, for���� ��ͺ��� ������ ����
 * @author men16
 *
 */
public class p7_4 {
	
	static int [] fibo;
	
	/**
	 * ��͹� ���� ������
	 * @param n
	 * @return
	 */
//	public int DFS(int n) {
//		if(n==1) return 1;
//		else if(n==2) return 1;
//		else return DFS(n-2) + DFS(n-1);
//	}
	
	public int DFS(int n) {
		if(fibo[n]>0) return fibo[n];
		if(n==1) return fibo[n] = 1;
		else if(n==2) return fibo[n] = 1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}
	
	public static void main(String[] args) {
		p7_4 T = new p7_4();
		int n = 10;
		fibo = new int[n+1];
		T.DFS(n);
//		for(int i = 1; i <= n; i++) System.out.print(T.DFS(i) + " ");
		for(int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
	}
}
