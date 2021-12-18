
public class p9 {
	
	    public int solution(int n, int[] lost, int[] reserve) {
	        int[] people = new int[n];
	        int answer = n;

	        for (int l : lost) 
	            people[l-1]--;
	        for (int r : reserve) 
	            people[r-1]++;

	        for (int i = 0; i < people.length; i++) {
	            if(people[i] == -1) {
	                if(i-1>=0 && people[i-1] == 1) {
	                    people[i]++;
	                    people[i-1]--;
	                }else if(i+1< people.length && people[i+1] == 1) {
	                    people[i]++;
	                    people[i+1]--;
	                }else 
	                    answer--;
	            }
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		int n = 5; 
		int [] lost = {2,4};
		int [] reserve = {3};
		
		p9 p9 = new p9();
		int answer = p9.solution(n,lost,reserve);
		System.out.println(answer);
	}
}
