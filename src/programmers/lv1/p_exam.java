package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class p_exam {
	public int[] solution(int[] answers) {
		
		int [] first = {1, 2, 3, 4, 5};
		int [] second = {2, 1, 2, 3, 2, 4, 2, 5};
		int [] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int fcount = 0;
		int scount = 0;
		int tcount = 0;
		
		for(int i = 0; i < answers.length; i++) {
			
			int j = i % 5;
			int k = i % 8;
			int l = i % 10;
			
			if(answers[i] == first[j]) {
				fcount++;
			}
			
			if(answers[i] == second[k]) {
				scount++;
			}
			
			if(answers[i] == third[l]) {
				tcount++;
			}
			
		}
		
//		System.out.println(fcount);
//		System.out.println(scount);
//		System.out.println(tcount);
		
		
		int highest = Math.max(fcount, Math.max(scount, tcount));
		
		List<Integer> aList = new ArrayList<>();
		
		if(highest == fcount) {
			aList.add(1);
		}
		
		if(highest == scount) {
			aList.add(2);
		}
		
		if(highest == tcount) {
			aList.add(3);
		}
		
        return aList.stream().mapToInt(Integer::intValue).toArray();
    }
	
	public static void main(String[] args) {
		p_exam p = new p_exam();
		
		int [] answers = {1,3,2,4,2};
		
		for(int s : p.solution(answers)) {
			System.out.println(s);
		}
	}
}
