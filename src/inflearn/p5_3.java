package inflearn;

import java.util.Scanner;
import java.util.Stack;

public class p5_3 {

	public int solution(int [][] board, int [] moves) {
		
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < moves.length; i++) {
			int pos = moves[i] - 1;
			for(int k = 0; k < board.length; k++) {
				int cur = board[k][pos];
				if(cur != 0) {
//					System.out.println(cur);
					if(stack.isEmpty()) {
						stack.push(cur);
					}
					else if(stack.peek() == cur) {
						answer+=2;
						stack.pop();
					} else {
						stack.push(cur);
					}
					board[k][pos] = 0;
					break;
					
				}
			}
		}
//		System.out.println();
//		for(int i = 0; i < board.length; i++) {
//			for(int j = 0 ; j < board.length; j++) {
//				System.out.print(board[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		p5_3 T = new p5_3();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][] board = new int [n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int v = sc.nextInt();
		int [] moves = new int [v];
		for(int i = 0; i < v; i++) {
			moves[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(board, moves));
	}
}
