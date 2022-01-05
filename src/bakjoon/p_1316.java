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
			int now = str.charAt(i); // char 문자를 int형으로 변경
			
			if(prev != now) {
				if(!check[now - 'a']) { // a = 97, 처음 prev 초기값 0과는 다르므로 check[0] 배열은 true
					// 나온 적이 있는 문자인지 확인, -'a'를 하면 check가 이전에 나온 문자인지 확인할 수 있다.
					check[now - 'a'] = true; // 알파벳의 now - 'a' 번째 문자가 나온 적이 있는 것으로 체크
					prev = now;
				} else {
					return false;
				}
			}
			
		}
		
		return true;
	}
	
	
}
