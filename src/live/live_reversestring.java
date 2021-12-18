package live;

public class live_reversestring {

	public static void main(String[] args) {
		// 문자열
		String str = "ABCDE";
		// 문자열 reverse
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		// 결과 출력
		System.out.println(sb); // "EDCBA"
		System.out.println(reverse); // "EDCBA"
	}

	public void reverse() {
		// 문자열
		String str = "ABCDE";
		// 문자열 reverse
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		// 결과 출력
		System.out.println(reverse); // "EDCBA"
	}

}
