package doit.datastructure;

import java.util.Scanner;
import java.util.Stack;

public class P1874_���ü��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] nArr = new int [n];
		
		for(int i = 0; i < n; i++) {
			nArr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		int num  = 1; // �������� ��
		boolean result = true;
		
		for(int i = 0; i < n; i++) {
			
			if(nArr[i] >= num) {
				while(nArr[i] >= num) { // ���� ���� �� >= �������� �ڿ���: ���� ������ ������ push() ����
					stack.push(num++);
					bf.append("+\n");
				}
				
				stack.pop();
				bf.append("-\n");
			} else { // ���� ���� �� < �������� �ڿ��� : pop()�� ������ ���� ���Ҹ� ����
				int cur = stack.pop();
				if(cur > nArr[i]) { // ������ ���� ���� ���� ������ �ϴ� ������ ������ ũ�� ������ ����� �� ����
					System.out.println("NO"); // �� ��쿡�� ����ϴ� ������ ���� ���� ���� ����ؾ� �� ������ Ŀ����, ���;� �� ���� ǥ������ ����
					/**
					 * ���� ������ 3,4�̰� ���� ���� 3�� ���, ����ؾ� �� ���� ���� ���� 3�� ��ġ�ؾ� �ϴµ�, 4�� ���� �����鼭 ���� �Է� �迭�� ��µǴ� �迭�� �޶�����.
					 */
					result = false;
					break;
				} else {
					bf.append("-\n");
				}
			}
			
		}
		
		if(result) System.out.println(bf.toString());
		sc.close();
	}
	
}
