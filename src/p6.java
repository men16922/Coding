import java.util.ArrayList;

public class p6 {
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
 
        int second = 0;
        int count = 0; // Ʈ���� �ε���
        ArrayList<Integer> remainTruck = new ArrayList<Integer>(); // ���� Ʈ���� ��
        ArrayList<Integer> maxTruck = new ArrayList<Integer>(); // �ٸ��� �ǳʴ� Ʈ���� ��
        for(int i = 0; i < truck_weights.length; i++) {
    		remainTruck.add(truck_weights[i]);
    	}

        do {
        	//System.out.println("���� Ʈ�� : " + remainTruck.size());
        	
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
        	//Ʈ������ �ѹ��� ������ �����ִ���
        	for(int i=0; i<remainTruck.size(); i++) {
        		max+=remainTruck.get(i);
        		//System.out.println(remainTruck.get(i));
        		if(max>weight) {
        			max-=remainTruck.get(i);
        			idx=i;
        			System.out.println(max);
        			break; // �ִ빫�� �ѱ�� break
        		}
        		else if (max == weight) {
        			return bridge_length+remainTruck.get(i);
        		}
        		maxTruck.add(remainTruck.get(i));
        	}
        	

        	second+=bridge_length; 
        	count += idx;
        	//System.out.println(second);
        	remainTruck.clear(); // ���� Ʈ���� ���� �ʱ�ȭ
        	for(int i = count; i < truck_weights.length; i++) { //���� Ʈ���� �� ����
        		remainTruck.add(truck_weights[i]);
        	}
        	//System.out.println(second+ "�� ���� ���� Ʈ�� : "  + remainTruck.size());
        	maxTruck.clear(); // �ٸ��� �ǳʴ� Ʈ���� �� �ʱ�ȭ
        	
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
