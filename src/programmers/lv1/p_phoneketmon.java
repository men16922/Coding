package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class p_phoneketmon {
		
	
	public static int solution(int[] nums) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(nums[0]);
        
		// nums[] �迭�� �ߺ�����
		for(int i=1; i<nums.length; i++) 
			if(!list.contains(nums[i]))
				list.add(nums[i]);
        
		/* list.size(): ���ϸ��� ����, nums.length: ���� �� �ִ� ���ϸ��� �� */
		answer = (list.size() < nums.length/2) ? list.size() : nums.length/2;
		return answer;
    }
	public static void main(String[] args) {
		
		int[] nums = {3,1,2,3};
		
		System.out.println(solution(nums));
	}
}
