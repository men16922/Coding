package programmers.lv1;

import java.util.Arrays;

public class skillcheck_1 {

	static int max = 0;
	
	public static int solution(int[] d, int budget) {
		boolean[] visited = new boolean[d.length];
		
        for(int r = 1; r <= d.length; r++) {
        	System.out.println("\n" + d.length + "개 중에 " + r  + "개 뽑음");
            comb1(d, visited, 0, r, budget);
        }
        
        System.out.println("최대값 :" + max);
        return max;
    }
	
	// 백트래킹을 이용한 조합 
    static void comb1(int[] arr, boolean[] visited, int start, int r, int budget) {
        if(r == 0) {
        	int cnt = 0;
        	int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                if(visited[i] == true) {
                    System.out.print(arr[i] + " ");
                	cnt++;
                    sum = sum + arr[i];
                }
                
            }
            System.out.println("합:" + sum);
            if(max < cnt && sum <= budget) {
            	max = cnt;
            }
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1, budget);
                visited[i] = false;
            }
        }
    }
    
    public static int solution2(int[] d, int budget) {
    	
    	int result = 0;
    	
    	Arrays.sort(d);
    	
    	for(int i = 0; i < d.length; i++) {
    		result += d[i];
    		System.out.println(result + "," + budget);
    		if(result > budget) {
    			return i;
    		}
    	}
    	
        return d.length;
    }
	
	public static void main(String[] args) {
		int [] d = {1,3,2,5,4};
		int budget = 9;
//		System.out.println(solution(d, budget));
		System.out.println(solution2(d, budget));
	}
}
