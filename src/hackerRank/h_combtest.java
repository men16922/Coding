package hackerRank;

import java.io.IOException;
import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

	static long min = Long.MAX_VALUE;
    static long max = Long.MIN_VALUE;
     
	public static void comb(List<Integer> arr, boolean[] visited, int start, int n, int r) {
		if(r == 0) {
			long sum = 0;
			for(int i = 0; i < n; i++) {
				if(visited[i]) {
					sum += arr.get(i);
				}
			}
			min = Math.min(min, sum);
			max = Math.max(max, sum);
			return;
		}
		
		for(int i = start; i < n; i++) {
			visited[i] = true;
			comb(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
		
		
	}
	
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
       

        int size = arr.size();
        boolean[] visited = new boolean[size];
        comb(arr, visited, 0, size, 4);
        
        System.out.println(min + " " + max);
        
    }

}

public class h_combtest {
	
	static long min = Long.MAX_VALUE;
    static long max = Long.MIN_VALUE;
	
	/**
	 * ��Ʈ��ŷ ����
	 * @param arr : ������ �̾Ƴ� �迭
	 * @param visited : ���տ� �������� Ȯ���ϱ� ���� �迭
	 * @param start : ����, start���� ������ ���� �ĺ����� ����
	 * @param n : �迭�� ũ��
	 * @param r : �迭���� �̾Ƴ� ����
	 */
	public static void comb(long[] arr, boolean[] visited, int start, int n, int r) {
		if(r == 0) {
			long sum = 0;
			for(int i = 0; i < n; i++) {
				if(visited[i]) {
					sum += arr[i];
				}
			}
//			System.out.println(sum);
			min = Math.min(min, sum);
			max = Math.max(max, sum);
			
			print(arr, visited, n);
			return;
		}
		
		for(int i = start; i < n; i++) {
			visited[i] = true;
			comb(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
		
		
	}
	
	// ��� ���
	// ��� ���� : comb2(arr, visited, 0, n, r)
	// depth : ���� �ε���
	public static void comb2(long[] arr, boolean[] visited, int depth, int n, int r) {
	    if (r == 0) {
	        print(arr, visited, n);
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
	
    public static void main(String[] args) throws IOException {
    	int n = 5;
        long[] arr = {942381765, 627450398, 954173620, 583762094, 236817490};
        boolean[] visited = new boolean[n];
 
        comb(arr, visited, 0, n, 4);
        
        System.out.println(min);
        System.out.println(max);
    }
    
 // �迭 ���
    static void print(long[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        
    }
}
