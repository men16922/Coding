package inflearn;

/**
 * �κ����� ���ϱ�(DFS)
 * @author men16
 *
 */
public class p7_6 {
	
	static int n; // �κ����� ����
	static int [] ch;
	
	public void DFS(int L) {
		if(L == n + 1) {
			String tmp = "";
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 1) tmp += i + " ";
			}
			if(tmp.length() > 0) // ���̰� 0�̸� ������
				System.out.println(tmp);
			
		} else {
			ch[L] = 1; // ����Ѵ�
			DFS(L+1); // ����
			ch[L] = 0; // ������� �ʴ´�
			DFS(L+1); // ������
		}
	}
	
	public static void main(String[] args) {
		p7_6 T = new p7_6();
		
		n = 3;
		
		ch = new int[n+1];
		T.DFS(1);
	}
}
