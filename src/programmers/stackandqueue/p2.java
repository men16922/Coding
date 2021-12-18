package programmers.stackandqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p2 {
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i <priorities.length; i++) {
        	queue.add(priorities[i]);	
        }
        
        Arrays.sort(priorities); //�켱������ ���ϱ� ���� ���� ���� ����
        int length = priorities.length-1; //�������� �� ������ ��Ұ� ���� ū �� 
        
        while(!queue.isEmpty()) {
        	int cur = queue.poll();
        	
        	//�켱������ ���� ���� �� == ���� ť�� ��� (����Ʈ ����)�� ������
        	if(cur == priorities[length - answer]) {
        		answer++;
        		location--;
        		if(location<0) {
        			break;
        		}
        		} else {
        			//ó���� queue.poll�� �ߴ� ���� add �����ν� �� �ڷ� �и�
        			queue.add(cur);
        			location--; // 1
        			if(location < 0){
                        location = queue.size()-1;
                    }
        		}
        	}
        	
        return answer;	
    }
	
	public static void main(String[] args) {
		int [] priorites = {2, 1, 3, 2};
		int location = 2;
		System.out.println(solution(priorites, location));
	}
}
