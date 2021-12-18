import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p13 {

	 public static int[] solution(int[] progresses, int[] speeds) {
	        Queue<Integer> q = new LinkedList<>();
	        List<Integer> answerList = new ArrayList<>();

	        for (int i = 0; i < speeds.length; i++) {
	            double remain = (100 - progresses[i]) / (double) speeds[i];
	            int date = (int) Math.ceil(remain);
	            //System.out.println(date);
	            if (!q.isEmpty() && q.peek() < date) {
	                answerList.add(q.size());
	                System.out.println(q.size());
	                q.clear();
	            }

	            q.offer(date);
	        }

	        answerList.add(q.size());

	        int[] answer = new int[answerList.size()];

	        for (int i = 0; i < answer.length; i++) {
	            answer[i] = answerList.get(i);
	            //System.out.println(answer[i]);
	        }

	        return answer;
	    }
	
	public static void main(String[] args) {
		
		int [] progresses = {95, 90, 99, 99, 80, 99};
		int [] speeds = {1, 1, 1, 1, 1, 1};
		
		int [] answer = solution(progresses, speeds);
		

	}
}
