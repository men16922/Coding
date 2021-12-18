package live;
/**
 *  
소수가 되는 수의 배수를 지우면 남은 건 소수가 된다
1. 2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다.
2. 소수가 되는 수의 배수를 지우면 남은 건은 소수만 된다
자기 자신을 제외한 2의 배수를 모두 지운다.
남아 있는 수 가운데 3은 소수이므로 오른쪽에 3을 쓴다.
자기 자신을 제외한 3의 배수를 모두 지운다.
남아 있는 수 가운데 5는 소수이므로 오른쪽에 5를 쓴다.
자기 자신을 제외한 5의 배수를 모두 지운다.
위 과정을 반복한다.
 * @author men16
 *
 */
public class live_prime_erastotenes {
static boolean prime[] = new boolean[121];
    
    public static void main(String[] args) throws Exception{
		
        // 구하고자 하는 숫자 범위
        int N = 120;
        
        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;
        
        for(int i=2; i*i<=N; i++){
        	// prime[i]가 소수라면
            if(!prime[i]){
            	// prime[j] 소수가 아닌 표시
            	for(int j=i*i; j<=N; j+=i) prime[j] = true;                
            }        
        }    
        
        // 소수 출력
        for(int i=1; i<=N;i++){
        	if(!prime[i]) System.out.print(i+" ");        
        }
        
    }
}
