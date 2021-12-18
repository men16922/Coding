package live;

import java.util.Arrays;

/**
 * 선택 정렬
 * 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고, 그 다음
 * 작은 데이터를 선택해 앞에서 두 번째 데이터와 바꾸는 과정을 반복한다.
 * @author men16
 *
 */
public class live_selectionsort {

	public static void main(String[] args) {
		int [] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		int minIndex = 0; // 가장 적은 원소의 인덱스
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) 
					minIndex = j;
				}
			// 스와프
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		System.out.println(Arrays.toString(arr));	
	}
	
}
