package programmers.lv1;

public class p_newid {

	public String solution(String new_id) {
		
		String answer = new_id.toLowerCase();//1�ܰ� �ҹ��� ġȯ
		
		answer = answer.replaceAll("[^-_.a-z0-9]", ""); // 2�ܰ�
		/*
		 * ^ : not
		 * ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
		 */
		answer = answer.replaceAll("[.]{2,}", "."); // 3�ܰ�
		/**
		 * [.]�� 2ȸ �̻�{2,} �ݺ��Ǹ� .���� ġȯ
		 * ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		 */
		answer = answer.replaceAll("^[.]|[.]$", ""); // 4�ܰ�
		/**
		 * ^[.] : .���� ����
		 * [.]$ : .���� ��ħ
		 * ��ħǥ�� ó���̳� ���� ��ġ�ϸ� ����
		 */
		
		 if(answer.equals("")) { // 5�ܰ�
			 answer += "a";
		 }
		 
		 if(answer.length() >= 16) { // 6�ܰ�
			 answer = answer.substring(0, 15);
			 answer = answer.replaceAll("[.]$", "");
		 }
		 
		 if(answer.length() <= 2) { // 7�ܰ�
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
