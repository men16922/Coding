package inflearn;

import java.util.Scanner;

/**
 * 미로탐색(DFS)
 * @author men16
 *
 */
public class p8_10 {
	static int [] dx = {-1, 0, 1, 0}; // 12, 3, 6, 9 시 방향
	static int [] dy = {0, 1, 0, -1};
	static int [][] board;
	static int answer = 0;
	
	public void DFS(int x, int y) {
		if(x == 7 && y == 7) answer++; // 종착점 도착
		else {
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i]; // 현재지점 + 방향
				int ny = y + dy[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <=7 && board[nx][ny] == 0) {
					// 갈 수 있는 지점(0)이며 바운더리 안인지 체크
					board[nx][ny] = 1; // 간 지점 체크
					DFS(nx, ny); // nx, ny 지점으로 이동
					board[nx][ny] = 0; // 뒤로 돌아갈때 처리
				}
			}
		}
	}
	
	public static void main(String[] args) {
		p8_10 T = new p8_10();
		Scanner kb = new Scanner(System.in);
		board = new int [8][8];
		
		for(int i = 1; i <= 7; i++) { // 1번 인덱스부터 사용
			for(int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		board[1][1] = 1; // 출발점 체크
		T.DFS(1, 1);
		System.out.println(answer);
	}
}
