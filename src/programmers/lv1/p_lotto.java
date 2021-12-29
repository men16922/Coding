package programmers.lv1;
/**
 * �ζ��� �ְ� ������ ���� ����
 * ������ �������, �ζǿ� ��÷ ��ȣ�� ��ġ�ϴ� ��ȣ�� ������ ����
 * 6�� ���߸� 1��, 5�� ���߸� 2��, 2�� ���߸� 5��, 1�� ���߸� 6��
 * @author men16
 *
 */
public class p_lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
        
        int cnt = 0; // �´� ����
        int cnt2 = 0; // 0�� ����
        for(int i = 0; i < lottos.length; i++) {
        	for(int j = 0; j < win_nums.length; j++) {
        		if(lottos[i] == win_nums[j]) { // �´� ���ڰ� ������
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
		int [] lottos = {44, 1, 0, 0, 31, 25}; // 0�� �˾ƺ� �� ���� ��ȣ
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		
		int [] answer = p.solution(lottos, win_nums);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
		
	}
}
