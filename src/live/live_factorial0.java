package live;

import java.util.Scanner;

/**
 *  뒷자리가 0이 나오는 경우는 언제인가? 
 *  2와 5가 곱해져 있을 때다. 이 말은 거꾸로 말하자면 소인수분해를 해서
 *  2와 5가 존재할 경우 뒷자리는 0으로 끝난다는 것이다.
 *  5의 n승에 따라 카운트 값을 한 개 더 추가
 *  반복문을 통해 5로 나누면서 누적합
 * @author men16
 *
 */
public class live_factorial0 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int num = in.nextInt();
		int count = 0;
 
		while (num >= 5) {
			count += num / 5;
			num /= 5;
		}
		System.out.println(count);
	}
}
