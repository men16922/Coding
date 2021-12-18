package toss;

import java.util.HashMap;
import java.util.Map.Entry;

public class toss1 {
	// 참여자 명단을 Map으로 만들어서 key를 참여자, value를 0으로 한다.
	// 동명이인이 있을 경우 getOrDefault로 1씩 더해준다
	// 완주자 명단에 이름이 있을떄마다 value를 1씩 빼준다.
	// value가 0이 아닌 key(참여자)를 return 한다.
	
	public static long solution(long orderAmount, long taxFreeAmount, long serviceFee) {
        // orderAmount : 주문금액
        // taxFreeAmount : 비과세금액
        // serviceFee : 봉사료
        long supplyAmount = orderAmount - serviceFee; // 공급대가 = 주문금액 - 봉사료
        long taxAmount = supplyAmount - taxFreeAmount; // 과세금액 = 공급가액 - 비과세금액
        long subAmount = (long) Math.ceil(taxAmount/10); //부가가치세 = 과세금액의 10%
        long supAmount = supplyAmount - subAmount; // 공급가액 = 공급대가 - 부가가치세
        
        if(supplyAmount - taxFreeAmount == 1L) {
            subAmount = 0;
        }
        
        return subAmount;
    }
	
	public static void main(String[] args) {
		
		long answer = solution(100, 0, 0);
		System.out.println(answer);
	}
}

