package live;

import java.util.Arrays;

/**
 * ���� ����
 * ���� ���� �����͸� ������ �� �տ� �ִ� �����Ϳ� �ٲٰ�, �� ����
 * ���� �����͸� ������ �տ��� �� ��° �����Ϳ� �ٲٴ� ������ �ݺ��Ѵ�.
 * @author men16
 *
 */
public class live_selectionsort {

	public static void main(String[] args) {
		int [] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		int minIndex = 0; // ���� ���� ������ �ε���
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) 
					minIndex = j;
				}
			// ������
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		System.out.println(Arrays.toString(arr));	
	}
	
}
