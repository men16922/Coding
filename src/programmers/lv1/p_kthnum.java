package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class p_kthnum {
	
//	public int[] solution(int[] array, int[][] commands) {
//        
//        
//		List<Integer> aList = new ArrayList<>();
//		List<Integer> tList = new ArrayList<>();
//		
//        for(int i = 0; i < commands.length; i++) {
//        	
//        	tList.clear();
//        	
//        	for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
//        		tList.add(array[j]);
//        	}
//        	
//        	Collections.sort(tList);
//        	
//        	aList.add(tList.get(commands[i][2] - 1));
//        	
//        }
//        
//        int[] answer = aList.stream().mapToInt(Integer::intValue).toArray();
//        return answer;
//    }
	
	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
	
	public static void main(String[] args) {
		p_kthnum p = new p_kthnum();
		
		int [] array = {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		for(int s : p.solution(array, commands)) {
			System.out.println(s);
		}
	}
}
