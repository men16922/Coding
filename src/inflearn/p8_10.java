package inflearn;

import java.util.Scanner;

/**
 * �̷�Ž��(DFS)
 * @author men16
 *
 */
public class p8_10 {
	static int [] dx = {-1, 0, 1, 0}; // 12, 3, 6, 9 �� ����
	static int [] dy = {0, 1, 0, -1};
	static int [][] board;
	static int answer = 0;
	
	public void DFS(int x, int y) {
		if(x == 7 && y == 7) answer++; // ������ ����
		else {
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i]; // �������� + ����
				int ny = y + dy[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <=7 && board[nx][ny] == 0) {
					// �� �� �ִ� ����(0)�̸� �ٿ���� ������ üũ
					board[nx][ny] = 1; // �� ���� üũ
					DFS(nx, ny); // nx, ny �������� �̵�
					board[nx][ny] = 0; // �ڷ� ���ư��� ó��
				}
			}
		}
	}
	
	public static void main(String[] args) {
		p8_10 T = new p8_10();
		Scanner kb = new Scanner(System.in);
		board = new int [8][8];
		
		for(int i = 1; i <= 7; i++) { // 1�� �ε������� ���
			for(int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		board[1][1] = 1; // ����� üũ
		T.DFS(1, 1);
		System.out.println(answer);
	}
}
