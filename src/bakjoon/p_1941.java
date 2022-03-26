package bakjoon;

import java.util.Scanner;

public class p_1941 {
	static int[] dx={-1, 0, 1, 0};
	static int[] dy={0, 1, 0, -1};
	static char[][] classes = new char[5][5];
	static boolean[][] checker = new boolean[5][5];
	static int answer=0;
	static int cnt = 0;
	static int Ycnt = 0;
	static int Scnt = 0;

	public static void DFS(int x, int y, int cnt) {
		if(cnt == 7) {
			answer++;
			cnt = 0;
		}
		else {
			System.out.println(cnt);
			for(int i=0; i<4; i++){
				int nx=x+dx[i];
				int ny=y+dy[i];
				if(nx>=x && nx<=5 && ny>=y && ny<=5){
					checker[nx][ny]=true;
					DFS(nx, ny, cnt++);
					checker[nx][ny]=false;
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean [][] checker = new boolean[5][5];
		for(int i = 0; i < 5; i++) {
			String text = sc.nextLine();
			for(int j = 0; j < 5; j++) {
				classes[i][j] = text.charAt(j);
			}
		}
		int answer = 0;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				DFS(i, j, cnt);	
 			}
		}
		
		System.out.println(answer);
	}
}
