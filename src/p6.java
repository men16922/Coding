import java.util.ArrayList;

public class p6 {
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
 
        int second = 0;
        int count = 0; // 트럭의 인덱스
        ArrayList<Integer> remainTruck = new ArrayList<Integer>(); // 남은 트럭의 수
        ArrayList<Integer> maxTruck = new ArrayList<Integer>(); // 다리를 건너는 트럭의 수
        for(int i = 0; i < truck_weights.length; i++) {
    		remainTruck.add(truck_weights[i]);
    	}

        do {
        	//System.out.println("남은 트럭 : " + remainTruck.size());
        	
        	if(remainTruck.size()==0) {
        		second+=bridge_length;
        		break;
        	}
        	if(remainTruck.size()==1) {
        		second+=bridge_length+1;
        		break;
        	}
        	
        	int max = 0;
        	int idx = 0;
        	//트럭들이 한번에 몇대까지 갈수있는지
        	for(int i=0; i<remainTruck.size(); i++) {
        		max+=remainTruck.get(i);
        		//System.out.println(remainTruck.get(i));
        		if(max>weight) {
        			max-=remainTruck.get(i);
        			idx=i;
        			System.out.println(max);
        			break; // 최대무게 넘기면 break
        		}
        		else if (max == weight) {
        			return bridge_length+remainTruck.get(i);
        		}
        		maxTruck.add(remainTruck.get(i));
        	}
        	

        	second+=bridge_length; 
        	count += idx;
        	//System.out.println(second);
        	remainTruck.clear(); // 남은 트럭의 개수 초기화
        	for(int i = count; i < truck_weights.length; i++) { //남은 트럭의 수 변경
        		remainTruck.add(truck_weights[i]);
        	}
        	//System.out.println(second+ "초 이후 남은 트럭 : "  + remainTruck.size());
        	maxTruck.clear(); // 다리를 건너는 트럭의 수 초기화
        	
        	//Thread.sleep(1000);
        } while(true);
        
        return second;
    }
	public static void main(String[] args) throws InterruptedException {
		int bridge_length = 100; 
		int weight = 100;
		int [] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		
		int answer = solution(bridge_length, weight, truck_weights);
		System.out.println(answer);
	}
}
