package inflearn;

import java.util.Scanner;

public class p2_3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int [] arr1 = new int [n];
		int [] arr2 = new int [n];
		for(int i = 0; i < n; i++) {
			arr1[i] = in.nextInt();
		}
		in.nextLine();
		for(int i = 0; i < n; i++) {
			arr2[i] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(game(arr1[i], arr2[i]));
		}
	}
	
	public static String game(int a, int b) {
		if(a == 1) {
			if(b == 1) {
				return "D";
			} else if(b == 2) {
				return "B";
			} else if(b == 3) {
				return "A";
			}
		} else if(a == 2) {
			if(b == 1) {
				return "A";
			} else if(b == 2) {
				return "D";
			} else if(b == 3) {
				return "B";
			}
		} else {
			if(b == 1) {
				return "B";
			} else if(b == 2) {
				return "A";
			} else if(b == 3) {
				return "D";
			}
		}
		return null;
	}
}
