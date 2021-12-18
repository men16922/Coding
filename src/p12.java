//import java.util.HashMap;

public class p12 {

	public int[] solution(int[] prices) {
        int[] answer = new int [prices.length];
        
        //HashMap<Integer, Integer> pMap = new HashMap<Integer, Integer>();
        
        for(int i = 0 ; i < prices.length; i++) {
        	//pMap.put(i, 0);
        	for(int j = i + 1; j < prices.length; j++) {
        		answer[i]++;
        		if(prices[i]>prices[j]) {
        			break;
        		}
        	}
        }
        
		/*
		 * for (Entry<Integer, Integer> entry : pMap.entrySet()) {
		 * System.out.println("[key]:" + entry.getKey() + ", [value]:" +
		 * entry.getValue());
		 * 
		 * }
		 */
        
/*        for(int i =0; i<= prices.length-1; i++) {
        	if (i==prices.length-1) {
        		answer[i] = 0;
        		break;
        	}
        	answer[i] = pMap.get(i);
        }*/

        
        return answer;
    }
	
	public static void main(String[] args) {
		int [] prices = {1, 2, 3, 2, 3};
		
		p12 p12 = new p12();
		int [] solution = p12.solution(prices);
		
		for(int i=0; i<solution.length; i++) {
			System.out.println(solution[i]);
		}
		
	}
}
