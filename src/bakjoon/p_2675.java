package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * ���ڿ� S�� �Է¹ް�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P ���
 * @author men16
 *
 */
public class p_2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
// 		Scanner ���
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		sc.nextLine();
//		
//		String ans = "";
//		
//		for(int i = 0; i < n; i++) {
//			String s = sc.nextLine();
//			String [] splited = s.split(" ");
//			int num = Integer.parseInt(splited[0]); // �ݺ� Ƚ��
//			String text = splited[1]; // �ݺ��� ����
//			for(int j = 0; j < text.length(); j++) {
//				for(int k = 0; k < num; k++) {
//					ans += text.charAt(j);
//				}
//				
//			}
//			ans += "\n";
//		}
//		System.out.println(ans);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String [] str = br.readLine().split(" ");
			
			int R = Integer.parseInt(str[0]);
			
			for(byte val : str[1].getBytes()) { // charAt�� byte�� ����
				for (int j = 0; j < R; j++) {
					sb.append((char) val);
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	

}
