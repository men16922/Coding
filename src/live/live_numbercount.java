package live;

import java.util.Scanner;

public class live_numbercount {
	 public static void main(String[] args) {
	        
	        //�Է¹��� �� �� ���̿� n�� ������?
	        
	        Scanner sc = new Scanner(System.in);
	        
	        int inputX = sc.nextInt(); //ù��° ��         
	        int inputY = sc.nextInt(); //�ι�° ��  
	        int n = sc.nextInt(); // ������ ����
	        int count = 0; // n�� ���� ī��Ʈ
	        
	        for(int i = inputX;i<=inputY;i++){
	            
	            int tmp = i;//������ �״�� �����ϱ����� ��ġ
	            
	            while(tmp>0){ // ���� �����ֳ� üũ
	                
	                if(tmp%10 == n){
	                    count ++;
	                }
	                
	                tmp = tmp / 10; //10�� ������ ������ , ���� ��������������
	            }
	        }
	    
	        System.out.println(n + "�� ���Ե� ������ ������ : "+count);

	 }
}
