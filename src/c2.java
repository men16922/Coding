import java.util.ArrayList;
import java.util.List;

public class c2 {
	/*
	 * commands 배열의 첫번째~두번째 사이의 인덱스들을 testList에 add
	 * testList를 정렬하고 commands의 세번쨰 index-1을 get해서 answerList에 추가
	 * answerList의 길이만큼 answer 배열을 선언해주고, answer 배열에 answerList의 값들을 넣어서 return
	 */
	public static int[] solution(int[] array, int[][] commands) {
	
	        List<Integer> answerList = new ArrayList<Integer>();	
	        
	        for(int i =0; i < commands.length; i++) {
	        	List<Integer> testList = new ArrayList<Integer>();	
	        
	        for(int j = commands[i][0]-1; j < commands[i][1]; j++) {
	        //	System.out.print(array[j] + " ");
	        	testList.add(array[j]);
	        }
	        testList.sort(null);
	  
	        answerList.add(testList.get(commands[i][2]-1));
			/*
			 * for (int index = 0; index < testList.size(); index++) {
			 * System.out.print(testList.get(index) + " "); } System.out.println();
			 * //System.out.println("\n");
			 */	        }
	        int [] answer = new int [answerList.size()];
	        for(int i = 0; i < answerList.size(); i++) {
	        	//System.out.println(answerList.get(i) + " ");
	        	answer[i] = answerList.get(i);
	        }
	        
	        return answer;
	    }
	


	public static void main(String[] args) {
		int [] array = {1, 5, 2, 6, 3, 7, 4};
		
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int [] answer = solution(array, commands);
		for(int i =0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
