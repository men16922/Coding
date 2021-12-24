package live;

import java.util.Scanner;

/**
 * String ���ڿ� ���� ��Ģ ������� ����� ������ �켱������ ��Ģ���� ����ϱ�
 * @author men16
 *
 */
public class live_stringcalculate {
	public static void main(String[] args) {
		/**
		 * 1. Scanner : ����ڷκ��� ���ڿ��� �Է¹���
		 * 2. input.indexOf(����) : ã������ ���ڰ� ������ -1 ���� ��ȯ�Ѵ�.
		 * 3. ��Ģ ������ �켱 ���� : * , /, +, -
		 * 4. ���� : ����ڰ� �Է��� ���ڿ� �ľ� > �ùٸ� ��Ģ ���� ���̸� > ��Ģ���� ��� ����
		 * 5. 5+2*10/5-5 ��� ���� : [2]*[10] = 20 > 20/[5] = 4 > [5] + 4 = 9 > 9 [-5] = 4
		 */
		
		Scanner scan = new Scanner(System.in);
		
		// ��Ģ���� ����
		System.out.print("��Ģ����� �Է� : ");
		String input = scan.next();
		System.out.println("");
		
		int output = calc(input); // 
		System.out.println(output);
	}
	
	// ��Ģ���� ���� ��� �޼ҵ�
	public static int calc(String input) {
		int idx;
		idx = input.indexOf('+');
		
		if(idx != -1) { // [+] ���ڰ� �����ϱ� -1�� �ƴϾ�� ��. (indexOf�� ã������ ���ڰ� ������ -1 ��ȯ) {
			return calc(input.substring(0, idx)) + calc(input.substring(idx + 1));
		}
		else { // [+] ���ڰ� ���� ���� [-], [*], [/] ������ ���� ���θ� Ȯ���Ѵ�.
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
