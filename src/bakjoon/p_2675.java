package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 문자열 S를 입력받고, 각 문자를 R번 반복해 새 문자열 P 출력
 * @author men16
 *
 */
public class p_2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
// 		Scanner 사용
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		sc.nextLine();
//		
//		String ans = "";
//		
//		for(int i = 0; i < n; i++) {
//			String s = sc.nextLine();
//			String [] splited = s.split(" ");
//			int num = Integer.parseInt(splited[0]); // 반복 횟수
//			String text = splited[1]; // 반복할 문자
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
			
			for(byte val : str[1].getBytes()) { // charAt을 byte로 변경
				for (int j = 0; j < R; j++) {
					sb.append((char) val);
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	

}
