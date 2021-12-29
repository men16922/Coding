package bakjoon;

import java.io.IOException;
import java.util.Scanner;

public class p_4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < n; i++) {
			int lineNum = sc.nextInt();
			
			int [] lineArr = new int [lineNum];
			int sum = 0;
			for(int j = 0; j < lineNum; j++) {
				lineArr[j] = sc.nextInt();
				sum += lineArr[j];
			}
			float avg = sum/lineNum;
//			System.out.println(avg);
			float cur = 0; // 평균 넘는 인원수
			for(int s : lineArr) {
				if(s > avg) {
					cur++;
				}
			}

			float percent = cur/(float)lineNum  * 100;
			System.out.println(String.format("%.3f%%", percent));
		}
	}
}
