package programmers.lv2;

public class p_stringCompress {
	
	public static int Solution(String s) {
		int answer = s.length(); // �����ϱ� �� ���ڿ� ���̷� �ʱ�ȭ
		
		for(int i = 1; i <= s.length() / 2; i++) {
			int zipLevel = 1; // ���� ��������
			String zipStr = s.substring(0, i); // ������ ����
			StringBuilder result = new StringBuilder(); // ����Ϸ��� ���ڸ� ������ StringBuilder
			
			for(int j = i; j <= s.length(); j +=i) {
				// ���� ���� ����
				String next = s.substring(j, j + i > s.length() ? s.length() : i + j);
				// ���� ���ڿ� ���� ���ڰ� ������ zipLevel ����
				if(zipStr.equals(next)) zipLevel++;
				else {
					// ������ �ȵǾ��� ���� ����, ������ �Ǿ��� ��� zipLevel�� �ٿ���, + ������ ���ڸ� �־���
					result.append((zipLevel != 1 ? zipLevel : "") + zipStr);
					zipStr = next; // ���� ���ڸ� ������ ���ڷ� ����
					zipLevel = 1; // ���� ���� 1�� �ʱ�ȭ
				}
			}
			result.append(zipStr); // �������� �߰��ȵ� zipStr �߰�
			answer = Math.min(answer, result.length()); // ���� ���� ���ڿ� ���� ����
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		String s = "xababcdcdababcdcd";
		System.out.println(Solution(s));
	}
}
