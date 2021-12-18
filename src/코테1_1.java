
public class 코테1_1 {
	
	public long[] solution(long n)
    {
       int num = (int) n;
       //String[] days = {"월","화","수","목","금","토","일"};
       int[][] daysArr = new int[7][num];
       int cnt = 0;
       int[] cntArr = new int[7]; 
       int x = 0; 

       for(int i = 0 ; i < daysArr.length; i++) {
      
          x = i;
          
          for(int j = 0; j < daysArr[i].length; j++) {
 
             if(x == 7) {
                x = 0; 
             }
             
             daysArr[i][j] = x;              
             x++;
             
             
             if(daysArr[i][j] == 5 || daysArr[i][j] == 6) {
                cnt++;
             }
             
             cntArr[i] = cnt;
    
          }

           cnt = 0;
       
          
       }
       
       for(int i = 0; i < cntArr.length; i++) {
          
//          System.out.print(cntArr[i]+" ");
          
       }
       
		
		int max = cntArr[0]; // 최대값
		int min = cntArr[0]; // 최소값
		for (int i = 0; i < cntArr.length; i++) {
			if (max < cntArr[i]) {
				max = cntArr[i];
			}

			if (min > cntArr[i]) {
				min = cntArr[i];
			}
		}
		//System.out.println(min +" " + max);
		long [] answer = new long [2];
		
		long min1=Long.valueOf(Integer.toString(min));
		long max2=Long.valueOf(Integer.toString(max));
		answer[0] = min1;
		answer[1] = max2;
		
		return answer;
	}
    
   public static void main(String[] args) {
      
      long n = 7L;
      long [] answer = solution(n);
      for (int i =0; i < answer.length; i++) {
    	  System.out.println(answer[i]);
      }
      

   }
	
}
