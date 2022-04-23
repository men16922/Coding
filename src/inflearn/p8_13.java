package inflearn;

import java.util.Scanner;

/**
 * 섬나라 아일랜드(DFS)
 * @author men16
 *
 */
public class p8_13 {
	static int [] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // 대각선 포함 8방향
	static int [] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static int answer = 0, n;
	
	/**
	 * 8방향 돌면서 1인걸 0으로 바꿔줌
	 * @param x
	 * @param y
	 * @param board
	 */
	public void DFS(int x, int y, int [][] board) {
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny <n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
	}

	
	public void solution(int [][] board) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) { // 섬의 위치(1) 이면
					answer++; // 섬의 개수
					board[i][j] = 0; // 출발점을 0으로 바꿔서 넘기기
					DFS(i, j, board);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		p8_13 T = new p8_13();
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
