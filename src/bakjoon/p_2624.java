package bakjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p_2624 {
	
	static int ans = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int k = sc.nextInt();
		int [] p = new int[k];
		int [] n= new int[k];
		
		int answer = 0;
		int count = 0;
		
		List<Integer> allList = new ArrayList<>();
		
		for(int i = 0; i < k; i++) {
			p[i] = sc.nextInt();
			n[i] = sc.nextInt();
			
			for(int j = 0; j < n[i]; j++) {
				allList.add(p[i]);
				count++;
			}
		}
		
		boolean [] visited = new boolean[count];
		
		
		int [] arr = new int [count];
		for(int i = 0; i < count; i++) {
			arr[i] = allList.get(i);
		}
		
		for(int i = 1; i <=arr.length; i++) {
			comb1(arr, visited, 0, i);
		}
		
		int sum = 0;
		
		
		
		System.out.println(ans);
	}
	
	 //1. 백트래킹을 이용해 구현
    static void comb1(int[] arr, boolean[] visited, int start, int r) {
        if(r == 0) {
            print(arr, visited);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }
	
 // 배열 출력
    static void print(int[] arr, boolean[] visited) {
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
