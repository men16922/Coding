package doit.datastructure;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class P17298_오큰수 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int A [] = new int [N]; // 수열 배열
		int ans [] = new int [N]; // 정답 배열
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0); // 처음에는 항상 스택이 비어 있으므로 최초 값을 push하여 초기화
		
		for(int i = 1; i < N; i++) {
			// 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 큰 경우
			while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()] = A[i]; // 정답 배열에 오큰수를 현재 수열로 저장하기
			}
			stack.push(i); // 신규 데이터 push
		}
		
		while(!stack.empty()) {
			// 반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면
			ans[stack.pop()] = -1;
			// 스택에 쌓인 index에 -1을 넣는다.`
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < N; i++) {
			bw.write(ans[i] + " ");
		}
		
		bw.write("\n");
		bw.flush();
		
	}
}
