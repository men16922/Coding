package inflearn;

import java.util.Scanner;

public class p2_4 {
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
	    int input1 = in.nextInt();
	    fibo(input1);
	}
	
	
	public  static void fibo(int n) {
		int a = 1, b =1, c;
		System.out.print(a+" " + b + " ");
		for(int i =2; i < n; i++) {
			c=a+b;
			System.out.print(c+ " ");
			a=b;
			b=c;
		
	}
	}
	
}
