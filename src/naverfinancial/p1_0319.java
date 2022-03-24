package naverfinancial;

import java.util.Arrays;

public class p1_0319 {

	boolean [] check;
	
	public int solution(int[][] dice) {
		
		int n = dice.length;
		
		boolean[] visited = new boolean[n];
		
		
		
		check = new boolean[(int)Math.pow(10, n)];
		
		for(int i = 0; i < dice.length; i++) {
			for(int j = 0 ; j < dice[i].length; j++) {
				check[dice[i][j]] = true;
			}
		}
		
		int cnt = 0;
		int answer = 0;

		while(cnt != n) {
//			System.out.println(cnt);
//			System.out.println(n);
//			System.out.println("-----");
			for(int i = 0; i < n; i++) {
				if(cnt != i) {
					checker(dice[cnt], dice[i]);
				}
			}
//			System.out.println("------");
			cnt++;
		}
//		System.out.println(cnt);
//		checker(dice[0], dice[1]);
//		checker(dice[1], dice[0]);

		
		for(int i = 0; i < check.length; i++) {
			if(!check[i]) {
				answer = i;
				break;
			}
		}
		
        return answer;
    }
	

	public void checker(int [] first , int [] second) {
		for(int i = 0; i < first.length; i++) {
			for(int j = 0; j < second.length; j++) {
//				System.out.println(first[i] * 10 + second[j]);
				check[first[i] * 10 + second[j]] = true;
			}
		}
	}
	
	
	public static void main(String[] args) {
		p1_0319 T = new p1_0319();
		
		int [][] dice = {{1, 6, 2, 5, 3, 4},{9, 9, 1, 0, 7, 8}};
		
		System.out.println("final : " +T.solution(dice));
	}
}
