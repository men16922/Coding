package live;

import java.util.Scanner;

/**
 * String 문자열 형식 사칙 연산식을 사용해 연산자 우선순위로 사칙연산 계산하기
 * @author men16
 *
 */
public class live_stringcalculate {
	public static void main(String[] args) {
		/**
		 * 1. Scanner : 사용자로부터 문자열을 입력받음
		 * 2. input.indexOf(문자) : 찾을려는 문자가 없으면 -1 값을 반환한다.
		 * 3. 사칙 연산자 우선 순위 : * , /, +, -
		 * 4. 로직 : 사용자가 입력한 문자열 파악 > 올바른 사칙 연산 식이면 > 사칙연산 계산 수행
		 * 5. 5+2*10/5-5 계산 설명 : [2]*[10] = 20 > 20/[5] = 4 > [5] + 4 = 9 > 9 [-5] = 4
		 */
		
		Scanner scan = new Scanner(System.in);
		
		// 사칙연산 수행
		System.out.print("사칙연산식 입력 : ");
		String input = scan.next();
		System.out.println("");
		
		int output = calc(input); // 
		System.out.println(output);
	}
	
	// 사칙연산 수행 재귀 메소드
	public static int calc(String input) {
		int idx;
		idx = input.indexOf('+');
		
		if(idx != -1) { // [+] 문자가 있으니까 -1이 아니어야 함. (indexOf는 찾으려는 문자가 없으면 -1 반환) {
			return calc(input.substring(0, idx)) + calc(input.substring(idx + 1));
		}
		else { // [+] 문자가 없을 경우는 [-], [*], [/] 연산자 포함 여부를 확인한다.
			idx = input.indexOf('-');
			if(idx != -1) {
				return calc(input.substring(0, idx)) - calc(input.substring(idx + 1));
			}
			else {
				
				idx = input.indexOf('*');
				if (idx != -1) {
					return calc(input.substring(0, idx)) * calc(input.substring(idx + 1));
				}
				else {
					idx = input.indexOf('/');
					if (idx != -1) {
						return calc(input.substring(0, idx)) / calc(input.substring(idx + 1));
					}
				}
				
			}
			 
		}
		
		String data = input.trim();
		if(data == null || data.isEmpty()) {
			return 0;
		}
		
		return Integer.parseInt(data);
	}
}
