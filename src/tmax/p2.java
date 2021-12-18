package tmax;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Pot {
    int seconds;
    boolean isEmpty;
    
    
    public Pot(int seconds, boolean isEmpty) {
		this.seconds = seconds;
		this.isEmpty = isEmpty;
	}

	public void go() {
    	seconds++;
    }
    
    public void empty() {
    	isEmpty = true;
    }
    
    public void full() {
    	isEmpty = false;
    }
}

public class p2 {

	public static int solution(int n, String[] recipies, String [] orders) {
		int answer = 0; // �ð�
		Map<String, Integer> rMap = getMap(recipies);
		
		Queue<String> orderQueue = new LinkedList<>();
		Map<Integer, Pot> pots = new HashMap<>();
		for(int i = 0; i < n; i++) {
			Pot pot = new Pot(0, true);
			pots.put(i, pot); 
		}
		for(int i = 0; i < orders.length; i++) {
			orderQueue.offer(orders[i]);

		}
		
		Map<Integer, Integer> pMap = new HashMap<Integer, Integer>(); // ���� ���� pot
		int min = 0;
		while(!orderQueue.isEmpty()) { // orderQueue�� ������

			for(int i : pots.keySet()) { // Pot�� ������ŭ loop
				Pot pot = pots.get(i);
	
				if(pot.isEmpty = true) { // ��� ������ ���� �ֱ�
					String[] str = orderQueue.poll().split(" ");;
					String order = str[0];
					int orderTime = rMap.get(order);
					int startTime = Integer.parseInt(str[1]);
					for(int j = 0; j< orderTime + startTime; j++) {
						pot.go();
					}
					pot.full();
					if(pot.seconds > min) {
						min = pot.seconds;
						pMap.put(min, i);
					}
				}
				
				
			} // ���� �� ���� for�� ����
//			System.out.println(min);
			answer += min; // ���� ���� pot�� �ð� �����ش�

			pots.get(pMap.get(min)).empty(); // �ش� pot�� ����.

		}
		
		return answer;
	}
	
	public static Map getMap(String[] recipies) {
		Map<String, Integer> rMap = new HashMap<>();
		for(int i = 0; i< recipies.length; i++) {
			String[] str = recipies[i].split(" ");
			String recipy = str[0];
//			System.out.println(recipy);
			int time = Integer.parseInt(str[1]);
			rMap.put(recipy, time);
		}
//		for(String s : rMap.keySet()) {
//			System.out.println(s);
//			System.out.println(rMap.get(s));
//		}
		return rMap;
	}
	
	public static void main(String[] args) {
		int n = 2;
		String [] recipies = {"A 3", "B 2"};
		String [] orders = {"A 1", "A 2", "B 3", "B 4"};
		
		int answer = solution(n, recipies, orders);
		System.out.println(answer);
	}
}
