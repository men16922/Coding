package programmers.lv1;

public class p_posneg_plus {
	
//	public int solution(int[] absolutes, boolean[] signs) {
//        int answer = 0;
//        
//        for(int i = 0; i < absolutes.length; i++) {
//        	
//        	int temp = signs[i] ? absolutes[i] : absolutes[i] * - 1;
//        	
//        	answer += temp;
//        }
//        
//        return answer;
//    }
	
	
	public int solution(int [] absolutes, boolean [] signs) {
		int answer = 0;
		
		for(int i = 0; i < signs.length; i++) {
			answer += absolutes[i] * (signs[i]? 1 : -1);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		p_posneg_plus p = new p_posneg_plus();
		
		int [] absolutes = {4, 7, 12};
		boolean [] signs = {true,false,true};
		
		System.out.println(p.solution(absolutes, signs));
	}
}
