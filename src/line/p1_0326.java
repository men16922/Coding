package line;

import java.util.regex.Pattern;

public class p1_0326 {

	public int solution(String[] logs) {
		int answer = 0;

		String[] exception = { "team_name : ", "application_name : ", "error_level : ", "message : " };
		boolean checker = false;
		for (int i = 0; i < logs.length; i++) {
			checker = false;
			if (logs[i].length() > 100) {
				checker = true;
				answer++;
			} else {
				for (String except : exception) {
					if (!logs[i].contains(except)) {

						answer++;
						checker = true;
						break;
					} else {
						
						logs[i] = logs[i].replace(except, "");

					}

				}
	
				if (!checker) {
					int cnt = 0;
//					System.out.println(logs[i]);
					String[] text = logs[i].split(" ");
					for (String t : text) {
//						System.out.println(t);
						if(!isAlpha(t))
							checker = true;
						cnt++;
					}
//					System.out.println(cnt);
					if(checker) {
						answer++;
					} else if(cnt > 4) {
						answer++;
					}
				}

			}

		}

		return answer;
	}
	
	public boolean isAlpha(String str){
		return Pattern.matches("[a-zA-Z]+",str);
		}

	public static void main(String[] args) {
		p1_0326 T = new p1_0326();

		String[] text = { "team_name : db application_name : dbtest error_level : info message : test", "team_name : test application_name : I DONT CARE error_level : error message : x", "team_name : ThisIsJustForTest application_name : TestAndTestAndTestAndTest error_level : test message : IAlwaysTestingAndIWillTestForever", "team_name : oberervability application_name : LogViewer error_level : error" };
		System.out.println(T.solution(text));
	}
}
