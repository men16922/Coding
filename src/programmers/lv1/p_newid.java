package programmers.lv1;

public class p_newid {

	public String solution(String new_id) {
		
		String answer = new_id.toLowerCase();//1단계 소문자 치환
		
		answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2단계
		/*
		 * ^ : not
		 * 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
		 */
		answer = answer.replaceAll("[.]{2,}", "."); // 3단계
		/**
		 * [.]이 2회 이상{2,} 반복되면 .으로 치환
		 * 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		 */
		answer = answer.replaceAll("^[.]|[.]$", ""); // 4단계
		/**
		 * ^[.] : .으로 시작
		 * [.]$ : .으로 마침
		 * 마침표가 처음이나 끝에 위치하면 제거
		 */
		
		 if(answer.equals("")) { // 5단계
			 answer += "a";
		 }
		 
		 if(answer.length() >= 16) { // 6단계
			 answer = answer.substring(0, 15);
			 answer = answer.replaceAll("[.]$", "");
		 }
		 
		 if(answer.length() <= 2) { // 7단계
			 while(answer.length() < 3) {
				 answer += answer.charAt(answer.length()-1);
			 }
		 }
		
        return answer;
    }
	
	public static void main(String[] args) {
		p_newid p = new p_newid();
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		System.out.println(p.solution(new_id));
	}
}
