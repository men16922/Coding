package bakjoon;

import java.util.Scanner;

public class p_2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String answer = "";
		
		int [][] apart = new int [15][15];
		
		for(int i = 0; i < 15; i++) {
			apart[0][i] = i;
		}
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				apart[i][j] = apart[i-1][j] + apart[i][j-1];
			}
		}
		
		
		for(int i = 0; i < t; i++) {
			int k = sc.nextInt(); // kÃþ
			int n = sc.nextInt(); // nÈ£
			
			answer += Integer.toString(apart[k][n]) + "\n";
		}
		
		answer = answer.substring(0, answer.length() - 1);
		
		System.out.println(answer);
	}
}
