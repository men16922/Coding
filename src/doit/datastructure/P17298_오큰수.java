package doit.datastructure;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class P17298_��ū�� {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int A [] = new int [N]; // ���� �迭
		int ans [] = new int [N]; // ���� �迭
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0); // ó������ �׻� ������ ��� �����Ƿ� ���� ���� push�Ͽ� �ʱ�ȭ
		
		for(int i = 1; i < N; i++) {
			// ������ ��� ���� �ʰ� ���� ������ ���� top �ε����� ����Ű�� �������� ū ���
			while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()] = A[i]; // ���� �迭�� ��ū���� ���� ������ �����ϱ�
			}
			stack.push(i); // �ű� ������ push
		}
		
		while(!stack.empty()) {
			// �ݺ����� �� ���� ���Դµ� ������ ��� ���� �ʴٸ�
			ans[stack.pop()] = -1;
			// ���ÿ� ���� index�� -1�� �ִ´�.`
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < N; i++) {
			bw.write(ans[i] + " ");
		}
		
		bw.write("\n");
		bw.flush();
		
	}
}
