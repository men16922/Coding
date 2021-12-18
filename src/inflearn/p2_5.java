package inflearn;

import java.util.Scanner;

public class p2_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int answer = 0;
		int [] ch = new int[n+1]; // n������ ì��
		
		for(int i = 2; i <= n ; i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j=i; j <=n; j=j+i) { // j�� ����� ������
					ch[j] = 1;
				}
			}
		}
	
		System.out.println(answer);
	}
}
