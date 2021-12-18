package inflearn;

import java.util.Scanner;

public class p2_10 {
	int [] dx = {-1, 0, 1, 0}; // ���츮��
	int [] dy = {0, 1, 0, -1}; // ���츮��
	
	public int solution(int n, int [][] arr) {
		int answer = 0;
		for(int i = 0; i< n; i++) {
			for(int j = 0; j < n; j++) {
				boolean flag = true;
				for(int k =0; k < 4; k++) {
					int nx = i + dx[k]; // ���� ����ǥ
					int ny = j + dy[k]; // ���� ����ǥ
					if(nx >= 0 && nx < n && ny >=0 && ny < n && arr[nx][ny]>=arr[i][j])  { // ��輱 üũ
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
