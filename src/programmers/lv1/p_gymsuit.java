package programmers.lv1;

import java.util.Arrays;

public class p_gymsuit {
	public static int solution(int n, int[] lost, int[] reserve) {

        int [] students = new int [n];
        
        int answer = n;
        
        for(int i : lost) {
        	students[i-1]--;
        }
        for(int i : reserve) {
        	students[i-1]++;
        }
        
        for(int i = 0; i < n; i++) {
        	if(students[i] == - 1) {
        		if(i - 1 >= 0 && students[i-1] == 1) {
        			students[i]++;
        			students[i-1]--;
        		} else if (i + 1 < students.length && students[i+1]== 1) {
        			students[i]++;
        			students[i+1]--;
        		} else {
        			answer--;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 5;
		int [] lost = {2, 4};
		int [] reserve = {1, 3, 5};
		System.out.println(solution(n, lost, reserve));
	}
}
