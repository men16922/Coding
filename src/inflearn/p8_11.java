package inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 미로의 최단거리 통로(BFS)
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

public class p8_11 {
	
	static int [] dx = {-1, 0, 1, 0}; // 12, 3, 6, 9 시 방향
	static int [] dy = {0, 1, 0, -1};
	static int [][] board, dis;


	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y)); // 객체(좌표)를 Queue에 삽입
		board[x][y] = 1; // 출발점
		
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					// 갈 수 있는 지점(0)이며 바운더리 안인지 체크
					board[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1; // 거리
				}
			}
		}
	} 
	
	public static void main(String[] args) {
		p8_11 T = new p8_11();
		Scanner kb = new Scanner(System.in);
		board = new int [8][8];
		dis = new int [8][8];
		
		for(int i = 1; i <= 7; i++) { // 1번 인덱스부터 사용
			for(int j = 1; j <= 7; j++) {
				board[i][j] = kb.nextInt();
			}
		}
	
		T.BFS(1, 1);
		if(dis[7][7] == 0) System.out.println(-1);
		else System.out.println(dis[7][7]);
	}
}


