package programmers.lv1;

public class p_inner {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i < a.length; i++) {
//        	System.out.println(a[i] * b[i]);
        	answer += a[i] * b[i];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		p_inner p = new p_inner();
		
		int [] a = {1,2,3,4};
		int [] b = {-3,-1,0,2};
		
		System.out.println(p.solution(a, b));
	}
}
