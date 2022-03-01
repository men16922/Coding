package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p6_6 {
	
	public ArrayList<Integer> solution(int [] arr) {
		int [] tmp = new int[arr.length];
		
		System.arraycopy(arr, 0, tmp, 0, arr.length);
		
		Arrays.sort(tmp);
		
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
//			System.out.println(tmp[i]);
			if(arr[i] != tmp[i]) {
				answer.add(i+1);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		p6_6 T = new p6_6();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(arr)) System.out.print(x + " ");
		
	}
}
