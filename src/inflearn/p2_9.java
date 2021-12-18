package inflearn;

import java.util.Scanner;

public class p2_9 {
	public int solution(int n, int [][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		for(int i = 0; i< n; i++) {
			sum1=sum2=0;
			for(int j = 0; j < n; j++) {
				sum1+=arr[i][j]; // ������
				sum2+=arr[j][i]; // ������
			}
			answer = Math.max(answer,  sum1);
			answer = Math.max(answer,  sum2);
		}
		
		sum1=sum2=0;
		for(int i = 0; i < n; i++) {
			sum1+=arr[i][i]; // ���� �밢��
			sum2+=arr[i][n-i-1]; // ���� �밢��
			
		}
		answer = Math.max(answer,  sum1);
		answer = Math.max(answer,  sum2);
		return answer;
	}
	public static void main(String[] args){
		p2_9 p = new p2_9();
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
