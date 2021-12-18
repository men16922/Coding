package inflearn;

import java.util.Scanner;

public class p2_10 {
	int [] dx = {-1, 0, 1, 0}; // 봉우리값
	int [] dy = {0, 1, 0, -1}; // 봉우리값
	
	public int solution(int n, int [][] arr) {
		int answer = 0;
		for(int i = 0; i< n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true;
				for(int k =0; k < 4; k++) {
					int nx = i + dx[k]; // 다음 행좌표
					int ny = j + dy[k]; // 다음 열좌표
					if(nx >= 0 && nx < n && ny >=0 && ny < n && arr[nx][ny]>=arr[i][j])  { // 경계선 체크
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		p2_10 p = new p2_10();
	    Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    
	    int [][] arr = new int[n][n];
	    for(int i = 0; i<n; i++) {
	    	for(int j = 0; j <n; j++) {
	    		arr[i][j] = in.nextInt();
	    	}
	    }
	    System.out.println(p.solution(n, arr));
	}
}
