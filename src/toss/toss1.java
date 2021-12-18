package toss;

import java.util.HashMap;
import java.util.Map.Entry;

public class toss1 {
	// ������ ����� Map���� ���� key�� ������, value�� 0���� �Ѵ�.
	// ���������� ���� ��� getOrDefault�� 1�� �����ش�
	// ������ ��ܿ� �̸��� ���������� value�� 1�� ���ش�.
	// value�� 0�� �ƴ� key(������)�� return �Ѵ�.
	
	public static long solution(long orderAmount, long taxFreeAmount, long serviceFee) {
        // orderAmount : �ֹ��ݾ�
        // taxFreeAmount : ������ݾ�
        // serviceFee : �����
        long supplyAmount = orderAmount - serviceFee; // ���޴밡 = �ֹ��ݾ� - �����
        long taxAmount = supplyAmount - taxFreeAmount; // �����ݾ� = ���ް��� - ������ݾ�
        long subAmount = (long) Math.ceil(taxAmount/10); //�ΰ���ġ�� = �����ݾ��� 10%
        long supAmount = supplyAmount - subAmount; // ���ް��� = ���޴밡 - �ΰ���ġ��
        
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

