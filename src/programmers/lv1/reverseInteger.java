package programmers.lv1;

public class reverseInteger {

	public static int[] solution(long n) {
        
        StringBuffer sb = new StringBuffer(Long.toString(n));
        String toString = sb.reverse().toString();
        System.out.println(toString);
        
        int[] answer = new int[toString.length()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = Character.getNumericValue(toString.charAt(i));
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 12345;
		
		for(int i : solution(n)) {
			System.out.println(i);
		}
	}
}
