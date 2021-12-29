package bakjoon;


public class p_4673 {
	public static void main(String[] args) {

		boolean[] check = new boolean[10001]; // 1부터 10000 배열
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			if(n < 10001) {
				check[n] = true; // 생성자가 있는 수는 treu로 바꾸어줌
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) { // false인 인덱스만 출력
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number) {
		int sum = number; // 처음 숫자
		
		while(number != 0) { // 나눗셈 연산자로  10단위씩 number를 줄임. 0이 아닐 때까지 반복
			sum = sum + (number % 10); // 첫째 자리수를 처음 숫자에 더한다
			number = number / 10; // 10을 나누어 첫째 자리를 없앤다.
		}
		
		return sum; // return된 수는 생성자가 있는 수이다.
	}
}
