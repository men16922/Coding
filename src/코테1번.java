
public class ����1�� {

	  public static long[] solution(long n)
	    {
	        long [] answer = {0,0};
	        
	        long [] weekDay = {0, 1, 2, 3, 4, 5, 6, 7};
	        // �����Ϻ��� ������ 0
	        int count = 0;
	        for()
	        //System.out.println(count);
	        return answer;
	    }
	  
	public static void main(String[] args) {
		int n = 6;
		// weekday�� 0~6����
		
		// �� ������ ����
		int week = n/7;
		int least = 1; // �ּҰ�
		int max = 1 ; //�ִ밪
		if(n/7 < 1) {
			least = 1;
			if(n>1) {
				max =2;
			}
		}
		
		for(int i=0; i<week; i++) {
			if(n%7 == 0) // �������� ���
			{
				if(n/7 < 1) {
					 least+=1;
				}
				if(n%)
			}
			
		}
		
		System.out.println(6%7 );
		//long [] answer = solution(n);
		System.out.println("�ּҰ�:" +least + "�ִ밪" + max);
	}
}
