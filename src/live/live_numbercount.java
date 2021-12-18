package live;

import java.util.Scanner;

public class live_numbercount {
	 public static void main(String[] args) {
	        
	        //입력받은 두 수 사이에 n의 개수는?
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int inputX = sc.nextInt(); //첫번째 값         
	        int inputY = sc.nextInt(); //두번째 값  
	        int n = sc.nextInt(); // 선택한 숫자
	        int count = 0; // n의 개수 카운트
	        
	        for(int i = inputX;i<=inputY;i++){
	            
	            int tmp = i;//정수를 그대로 유지하기위한 장치
	            
	            while(tmp>0){ // 값이 남아있나 체크
	                
	                if(tmp%10 == n){
	                    count ++;
	                }
	                
	                tmp = tmp / 10; //10을 실제로 나눈다 , 값이 남아있을때까지
	            }
	        }
	    
	        System.out.println(n + "이 포함된 숫자의 개수는 : "+count);

	 }
}
