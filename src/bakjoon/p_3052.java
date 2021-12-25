package bakjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> dList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			int n = sc.nextInt() % 42;
			if(dList.contains(n)) {
				continue;
			} else {
				dList.add(n);
			}
		}
		
		System.out.println(dList.size());
	}
}
