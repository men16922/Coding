package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * �־��� ���� N���� ��
 * @author men16
 *
 */
public class p_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String text = br.readLine();
		int sum = 0;
		for(int i = 0; i < n; i++) {
//			System.out.println((text.charAt(i)));
			sum += text.charAt(i) - '0'; // 0�� �ƽ�Ű�ڵ�� 48
		}
		System.out.println(sum);
	}
}
