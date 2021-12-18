
public class 코테1번 {

	  public static long[] solution(long n)
	    {
	        long [] answer = {0,0};
	        
	        long [] weekDay = {0, 1, 2, 3, 4, 5, 6, 7};
	        // 월요일부터 갈경우는 0
	        int count = 0;
	        for()
	        //System.out.println(count);
	        return answer;
	    }
	  
	public static void main(String[] args) {
		int n = 6;
		// weekday는 0~6까지
		
		// 몇 주인지 세기
		int week = n/7;
		int least = 1; // 최소값
		int max = 1 ; //최대값
		if(n/7 < 1) {
			least = 1;
			if(n>1) {
				max =2;
			}
		}
		
		for(int i=0; i<week; i++) {
			if(n%7 == 0) // 월요일일 경우
			{
				if(n/7 < 1) {
					 least+=1;
				}
				if(n%)
			}
			
		}
		
		System.out.println(6%7 );
		//long [] answer = solution(n);
		System.out.println("최소값:" +least + "최대값" + max);
	}
}
