package bakjoon;

import java.io.IOException;

/**
 * �ܾ� �Է��ϸ�, ���� ���� ���� ���ĺ� ���
 * @author men16
 *
 */
public class p_1157 {
	public static void main(String[] args) throws IOException {
		int [] arr = new int [26]; // �������� ����
		
		int c = System.in.read();
		
		while (c > 64) { // ������ �Է¹޴� ���� ����
			
			if(c < 91) { // �빮���̸�
				arr[c - 65]++; 
			} else { // �ҹ����̸�
				arr[c - 97]++; 
			}
			c = System.in.read();
		}
		
		int max = -1;
		int ch = -2; // ? �� 63 �̴�.
		
		for(int i = 0; i < 26; i++) {
			
			if(arr[i] > max) { // array�� i�� �ִ밪���� ũ��, max �� ����
				max = arr[i];
				ch = i;
			} else if (arr[i] == max) { // array�� i�� �ִ밪�̸� -> max ���� ������
				ch = -2; // 63(?) ���
			}
		}
		System.out.println((char) (ch + 65));
	}
}
