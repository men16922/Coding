package live;

public class live_reversestring {

	public static void main(String[] args) {
		// ���ڿ�
		String str = "ABCDE";
		// ���ڿ� reverse
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		// ��� ���
		System.out.println(sb); // "EDCBA"
		System.out.println(reverse); // "EDCBA"
	}

	public void reverse() {
		// ���ڿ�
		String str = "ABCDE";
		// ���ڿ� reverse
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		// ��� ���
		System.out.println(reverse); // "EDCBA"
	}

}
