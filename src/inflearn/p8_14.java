package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ������ ���Ϸ���(BFS)
 * @author men16
 *
 */
class Point{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}

public class p8_14 {
	static int [] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // �밢�� ���� 8����
	static int [] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static int answer = 0, n;
	Queue<Point> queue = new LinkedList<>();
	
	/**
	 * 8���� ���鼭 1�ΰ� 0���� �ٲ���
	 * @param x
	 * @param y
	 * @param board
	 */
	public void BFS(int x, int y, int [][] board) {
		queue.add(new Point(x, y));
		while(!queue.isEmpty()) {
			Point pos = queue.poll();
			for(int i = 0; i < 8; i++) {
				int nx = pos.x + dx[i];
				int ny = pos.y + dy[i];
				if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					queue.add(new Point(nx, ny));
				}
				
			}
		}
	}

	
	public void solution(int [][] board) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) { // ���� ��ġ(1) �̸�
					answer++; // ���� ����
					board[i][j] = 0; // ������� 0���� �ٲ㼭 �ѱ��
					BFS(i, j, board);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		p8_14 T = new p8_14();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int [][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		T.solution(arr);
		System.out.println(answer);
	}
}
