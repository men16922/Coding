package live;
/**
 *  
�Ҽ��� �Ǵ� ���� ����� ����� ���� �� �Ҽ��� �ȴ�
1. 2���� �Ҽ��� ���ϰ��� �ϴ� ������ ��� ���� �����Ѵ�.
2. �Ҽ��� �Ǵ� ���� ����� ����� ���� ���� �Ҽ��� �ȴ�
�ڱ� �ڽ��� ������ 2�� ����� ��� �����.
���� �ִ� �� ��� 3�� �Ҽ��̹Ƿ� �����ʿ� 3�� ����.
�ڱ� �ڽ��� ������ 3�� ����� ��� �����.
���� �ִ� �� ��� 5�� �Ҽ��̹Ƿ� �����ʿ� 5�� ����.
�ڱ� �ڽ��� ������ 5�� ����� ��� �����.
�� ������ �ݺ��Ѵ�.
 * @author men16
 *
 */
public class live_prime_erastotenes {
static boolean prime[] = new boolean[121];
    
    public static void main(String[] args) throws Exception{
		
        // ���ϰ��� �ϴ� ���� ����
        int N = 120;
        
        // �Ҽ��� false
        // 1�� �Ҽ��� �ƴϹǷ� ����
        prime[0] = prime[1] = true;
        
        for(int i=2; i*i<=N; i++){
        	// prime[i]�� �Ҽ����
            if(!prime[i]){
            	// prime[j] �Ҽ��� �ƴ� ǥ��
            	for(int j=i*i; j<=N; j+=i) prime[j] = true;                
            }        
        }    
        
        // �Ҽ� ���
        for(int i=1; i<=N;i++){
        	if(!prime[i]) System.out.print(i+" ");        
        }
        
    }
}
