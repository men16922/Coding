import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class p4 {
	/*
	 * Map�� key�� clothes[i][1]�� �ϰ�, value�� getOrDefault�� ����Ͽ� �⺻���δ� 1, �ߺ��ɶ����� 1�� �����ش�.
	 * �ǻ��� �������� ���ؼ� ������ ���� �� �����Ƿ�(����: eyewear�� ��, headgear�� �ϳ��� 2*1���� ����)
	 * answer�� Map�� ����(�ִ� 4���� �ǻ�����)��ŭ �ݺ����� ���鼭 �ǻ��� ������ŭ �Ź� �����ش�.
	 * Map�� value�� �⺻���� 1(������ ���ؼ�)�̹Ƿ� value���� ���� �ǻ��� �������� 1���� ����.
	 * answer���� �⺻�� 1��ŭ ���ش�.
	 */
	public static int solution(String[][] clothes) {
        int answer = 1; // ������ ���� �⺻���� 1��
        int least = clothes.length;
        
        Map <String, Integer> cMap = new HashMap <String, Integer> ();
      
        for(int i=0; i < least; i++) {
        	cMap.put(clothes[i][1], cMap.getOrDefault(clothes[i][1], 1) + 1);
        }
        for (Entry<String, Integer> entry : cMap.entrySet()) {
            //System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
            answer *= entry.getValue();

        }
        return answer-1;
    }
	
	public static void main(String[] args) {
		String [][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		int answer = solution(clothes);
		System.out.println(answer);
	}
}
