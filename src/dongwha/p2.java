package dongwha;

import java.util.ArrayList;
import java.util.List;

public class p2 {
	
	static List<String> sList = new ArrayList<>();
	
	public int solution(int[] numbers) {
		int answer = 0;
		
		int n = numbers.length;
       
        
        List <Integer> nList = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
        	nList.add(numbers[i]);
        	nList.add(-1 * numbers[i]);
        }
        
        int [] arr = new int [numbers.length * 2];
        for(int i = 0; i < arr.length; i++) {
        	arr[i] = nList.get(i);
        }
        
        
        boolean[] visited = new boolean[arr.length];
        comb(arr, visited, 0, arr.length, arr.length/2);
		
        answer = sList.size();
		return answer;
	}
	
	public static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
		
	    if (r == 0) {
	    	String ans = print(arr, visited, n);
//	    	System.out.println(ans);
//	    	System.out.println(ans.lastIndexOf("0"));
	        if(!sList.contains(ans)&& ans.lastIndexOf("0") != -1) {
	        	sList.add(ans);
	        }
	        return;
	    }

	    if (depth == n) {
	        return;
	    }

	    visited[depth] = true;
	    comb(arr, visited, depth + 1, n, r - 1);

	    visited[depth] = false;
	    comb(arr, visited, depth + 1, n, r);
	}
	
	public static String print(int[] arr, boolean[] visited, int n) {
		int sum = 0;
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (visited[i]) {

				answer += Integer.toString(arr[i]) + " ";
				sum += arr[i];

			}
		}
		if (sum == 0) {
			answer += Integer.toString(sum);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		p2 p2 = new p2();
		int [] numbers = {8, 3, 5, 7, 3, 4};
		System.out.println(p2.solution(numbers));
	
	}	
}
