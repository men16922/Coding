package dongwha;

public class p3 {
	public int solution2(int n) {
	     int answer=0;
	        int count = 0;
	        int temp = n;
	    while (temp > 0) {
	        if (temp % 2 == 1) {
	            count++;
	        }
	        temp = temp / 2;
	    }
	    //count = 들어간 n 의 1의 갯수
	    return count;
	}
	public int solution(int n){
	    int answer = countOneBit(n);
	    int count = 0;
	    
	    for(int i = 0; i < n; i++) {
	    	if(countOneBit(i) == answer) {
	    		count++;
	    	}
	    		
	    }
	    return count;
	    }
	
	
	public int countOneBit(int value){
	    int i;
	    for(i = 0; value != 0; i++)
	    {
	        value &= (value - 1);
	    }
	    return i;
	}
	
	public static void main(String[] args) {
		p3 p2 = new p3();
		int n = 9;
		System.out.println(p2.solution(n));
	}
}
