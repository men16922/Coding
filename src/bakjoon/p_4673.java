package bakjoon;


public class p_4673 {
	public static void main(String[] args) {

		boolean[] check = new boolean[10001]; // 1���� 10000 �迭
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			if(n < 10001) {
				check[n] = true; // �����ڰ� �ִ� ���� treu�� �ٲپ���
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) { // false�� �ε����� ���
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) {
		int sum = number; // ó�� ����
		
		while(number != 0) { // ������ �����ڷ�  10������ number�� ����. 0�� �ƴ� ������ �ݺ�
			sum = sum + (number % 10); // ù° �ڸ����� ó�� ���ڿ� ���Ѵ�
			number = number / 10; // 10�� ������ ù° �ڸ��� ���ش�.
		}
		
		return sum; // return�� ���� �����ڰ� �ִ� ���̴�.
	}
}
