package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int cnt = 0;
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			if(check()) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static boolean check() throws IOException {
		boolean [] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i< str.length(); i++) {
			int now = str.charAt(i); // char ���ڸ� int������ ����
			
			if(prev != now) {
				if(!check[now - 'a']) { // a = 97, ó�� prev �ʱⰪ 0���� �ٸ��Ƿ� check[0] �迭�� true
					// ���� ���� �ִ� �������� Ȯ��, -'a'�� �ϸ� check�� ������ ���� �������� Ȯ���� �� �ִ�.
					check[now - 'a'] = true; // ���ĺ��� now - 'a' ��° ���ڰ� ���� ���� �ִ� ������ üũ
					prev = now;
				} else {
					return false;
				}
			}
			
		}
		
		return true;
	}
	
	
}
