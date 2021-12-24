package bakjoon;

import java.util.Scanner;

public class p_16205 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] str = sc.nextLine().split(" ");
		String s = str[1];
		
		StringBuilder ans = new StringBuilder();
		StringBuilder ans2 = new StringBuilder();
		
		if(Integer.valueOf(str[0]) == 1) { // ī��ǥ����� ���
			ans.append(s + "\n"); // ī��
			
			for(int i = 0; i< s.length(); i++) { // ������ũ ǥ������� �����
				if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') { // �빮���� ���
					ans.append("_" + (char)(s.charAt(i) + 32)); // �빮�� �ƽ�Ű�ڵ� + 32�� ���ؼ� �ҹ��ڷ� �����
				} else {
					ans.append(s.charAt(i));
				}
			}
			ans.append("\n" + (char)(s.charAt(0) - 32) + s.substring(1, s.length())); //�Ľ�Į ǥ���(ù ���� �빮��)�� �����
		} else if(Integer.valueOf(str[0]) == 2) { // ������ũǥ����� ���
			String [] temp = s.split("_"); // _�� ���ڿ� �ڸ���
			
			ans.append(temp[0].substring(0, temp[0].length())); // ī��ǥ��� ans ���ڿ��� ù��° �ڸ� ���ڿ� �ֱ�
			ans2.append((char)(temp[0].charAt(0) - 32) + temp[0].substring(1, temp[0].length())); // �Ľ�Įǥ��� �ι�° ���ڿ� �빮�ڷ� �����
			
			if(temp.length > 0) { // ������ ���ڿ��鿡 ���Ͽ� ó��
				for(int i = 1; i < temp.length; i++) {
					char a = (char) (temp[i].charAt(0) - 32); // ù ��° ���� �빮�ڷ� �����
					ans.append(a).append(temp[i].substring(1, temp[i].length())); // ī��ǥ��� ans ���ڿ��� �߰�
					ans2.append(a).append(temp[i].substring(1, temp[i].length())); // �Ľ�Įǥ��� ans2 ���ڿ��� �߰�
				}
			}
			
			ans.append("\n" + s + "\n" + ans2);
			
		} else if (Integer.valueOf(str[0]) == 3) { // �Ľ�Įǥ���
			ans.append((char)(s.charAt(0) + 32) + s.substring(1, s.length()) + "\n"); // ī��ǥ���. �ҹ��ڷ� �����
			
			for(int i = 0 ; i < s.length(); i++) { // ������ũǥ������� �����
				if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
					ans2.append("_" + (char)(s.charAt(i) + 32)); 
				} else {
					ans2.append(s.charAt(i));
				}
			}
			
			ans.append(ans2.substring(1, ans2.length()));
			ans.append("\n" + s);
		}
		
		System.out.println(ans);
	}
}
