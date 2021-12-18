import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class p4 {
	/*
	 * Map의 key를 clothes[i][1]로 하고, value를 getOrDefault를 사용하여 기본으로는 1, 중복될때마다 1씩 더해준다.
	 * 의상의 종류별로 곱해서 조합을 구할 수 있으므로(예시: eyewear가 둘, headgear가 하나면 2*1개의 조합)
	 * answer에 Map의 길이(최대 4개의 의상종류)만큼 반복문을 돌면서 의상의 개수만큼 매번 곱해준다.
	 * Map의 value의 기본값은 1(곱셉을 위해서)이므로 value값은 실제 의상의 개수보다 1개씩 많다.
	 * answer에서 기본값 1만큼 빼준다.
	 */
	public static int solution(String[][] clothes) {
        int answer = 1; // 곱셈을 위해 기본값은 1로
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
