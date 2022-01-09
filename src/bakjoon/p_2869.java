package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * �����̰� v������ ���� ���븦 ������
 * �Ϸ翡 a���� �ö󰡰� b���� �̲�������
 * ��ĥ �ɸ��°�?
 * @author men16
 *
 */
public class p_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String T = br.readLine();
		
		StringTokenizer st = new StringTokenizer(T);
		
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		int day = 0; // ���� �ɸ�����
		
		
		day = (v - b) / (a - b);
		if((v - b) % (a - b) !=0) {
			day++;
		}
		
		System.out.println(day);
	}
}
