package programmers.lv1;

import java.util.Stack;

public class p_crane {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
       
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int move : moves) {
        	for(int j = 0; j < board.length; j++) { // board�� ���̸�ŭ for���� ������.(�ش� ���ο��� �����̱� ����
        		if(board[j][move - 1] != 0) { // move ��° ������ ���� �ʾҴٸ�
//        			System.out.println(board[j][move - 1]);
        			if(stack.peek() == board[j][move - 1]) { // stack�� �ִ� �Ͱ� ������ ������ ���
        				stack.pop(); // �����.
        				answer += 2;
        			} else { // stack�� ������ push�Ѵ�.
        				stack.push(board[j][move - 1]); 
        			}
        			
        			board[j][move - 1] = 0;
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		p_crane p = new p_crane();
		
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(p.solution(board, moves));
	}
}
