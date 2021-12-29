package programmers.lv1;
/**
 * 로또의 최고 순위와 최저 순위
 * 순서와 상관없이, 로또에 당첨 번호와 일치하는 번호가 있으면 맞음
 * 6개 맞추면 1등, 5개 맞추면 2등, 2개 맞추면 5등, 1개 맞추면 6등
 * @author men16
 *
 */
public class p_lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
        
        int cnt = 0; // 맞는 개수
        int cnt2 = 0; // 0의 개수
        for(int i = 0; i < lottos.length; i++) {
        	for(int j = 0; j < win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) { // 맞는 숫자가 있으면
        			cnt ++;
        			break;
        		} else if(lottos[i] == 0) {
        			cnt2++;
        			break;
        		}
        	}
        }
        int[] answer = {rank(cnt + cnt2), rank(cnt)};
        return answer;
    }
	
	public int rank(int cnt) {
		
		switch(cnt) {
			case 6 : return 1; 
			case 5 : return 2; 
			case 4 : return 3; 
			case 3 : return 4; 
			case 2 : return 5; 
			default : return 6;
		}
		
	}
	
	public static void main(String[] args) {
		p_lotto p = new p_lotto();
		int [] lottos = {44, 1, 0, 0, 31, 25}; // 0은 알아볼 수 없는 번호
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		
		int [] answer = p.solution(lottos, win_nums);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		
	}
}
