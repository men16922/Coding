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
        
        Arrays.sort(priorities); //우선순위를 비교하기 위해 오름 차순 정렬
        int length = priorities.length-1; //오름차순 한 마지막 요소가 가장 큰 수 
        
        while(!queue.isEmpty()) {
        	int cur = queue.poll();
        	
        	//우선순위가 가장 높은 수 == 현재 큐에 담긴 (프린트 순서)가 같으면
        	if(cur == priorities[length - answer]) {
        		answer++;
        		location--;
        		if(location<0) {
        			break;
        		}
        		} else {
        			//처음에 queue.poll을 했던 수를 add 함으로써 맨 뒤로 밀림
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
