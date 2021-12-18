package toss;

import java.util.Arrays;
import java.util.List;

public class toss2 {
	
	 public static int[][] solution(int servers, boolean sticky, int[] requests) {
	        int[][] answer = new int [servers][servers];
	        
	        int count = 0;
	        if(!sticky) {
	   
	        	for(int i = 0; i < servers; i++) {
	        		for(int j = 0; j < servers; j++) {
	        			answer[i][j] = requests[count];
	        			count++;
	        		}
	        	}
	        }
	        return answer;
	    }

	public static void main(String[] args) {
		int servers = 2;
		boolean sticky = false;
		
		int[] requests = new int[] {1,2}; 
	
		int[][] result = solution(servers, sticky, requests);

		for(int i=0; i< result.length; i++) {
			for(int j=0; j< result[0].length; j++) {
				System.out.println(result[i][j]);
			}
		}
	}
}
