package live;

/**
 * 삽입 정렬(揷入整列, insertion sort)은 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다. ... 배열이 길어질수록 효율이 떨어진다.
 * @author men16
 *
 */
public class live_insertionsort {
	public static void main(String[] args) {
		int [] arr = {10, 2, 6, 4, 3, 7, 5};
		
		for(int i = 1; i < arr.length; i++) {
			int standard = arr[i]; // 기준
			int aux = i - 1; // 비교할 대상
			
			while(aux >= 0 && standard < arr[aux]) {
				arr[aux + 1] = arr[aux]; // 비교대상이 큰 경우 오른쪽으로 밀어냄
				aux--;
			}
			arr[aux + 1] = standard; // 기준값 저장
		}
		printArr(arr);
	}
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
	}
}
