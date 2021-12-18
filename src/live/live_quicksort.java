package live;

/**
 * 퀵정렬
 * @author men16
 *
 */
public class live_quicksort { 
	
	/*
	 * 퀵소트는 재귀호출을 하는 분할정복 알고리즘으로

	중간지점을 기준 삼아 중간지점의 값을 기준 (피봇)으로 삼아

	작은값은 앞쪽, 큰값는 뒤쪽에 위치하도록 서로 자리를 바꾼다. (정복)
	 * 리스트의 정가운데 값을 pivot으로 선택
	 * 시작 인덱스(low)는 계속 증가 시키고, 끝 인덱스(high)는 계속 감소 시키기 위한 while 루프를
	 * 두 인덱스가 서로 교차해서 지나칠 때까지 반복시킵니다.
	 * 시작 인덱스(low)가 가리키는 값과 pivot값을 비교해서 더 작은 경우 반복해서 시작 인덱스 값을 증가시킵니다.
	 * (pivot 값보다 큰데 좌측에 있는 값을 찾기 위해)
	 * 끝 인덱스(high)가 가리키는 값과 pivot 값을 비교해서 더 작은 경우 반복해서 끝 인덱스 값을 감소시킵니다.
	 * (pivot 값보다 작은데 우측에 있는 값을 찾기 위해)
	 * 두 인덱스가 아직 서로 교차해서 지나치치 않았다면 시작 인덱스(low)가 가리키는 값과 끝 인덱스(high)가ㅑ
	 * 가리키는 값을 상호 교대(swap)시킵니다. (잘못된 위치에 있는 두 값의 위치를 바꾸기 위해
	 * 상호 교대 후, 다음 값을 가리키기 위해 두 인덱스를 각자 진행 방향으로 한 칸씩 이동 시킵니다.
	 * 두 인덱스가 서로 교차해서 지나치게 되어 while 루프를 빠져나왔다면 다음 재귀 호출의 분할 기준점이
	 * 될 시작 인덱스를 리턴합니다.
	 */
	public static void quickSort(int [] arr) {
		sort(arr, 0, arr.length - 1);
	}
	
	private static void sort(int[] arr, int low, int high) {
		if (low >= high) return;
		int mid = partition(arr, low, high);
		sort(arr, low, mid - 1);
		sort(arr, mid, high);
	}
	
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < pivot) low++;
			while (arr[high] > pivot) high--;
			if(low <= high) {
				swap(arr, low, high);
				low++;
				high--;
			}
		}
		return low;
	}
	
	private static void swap(int [] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	} 
	
	public static void main(String[] args) {
		int [] arr = {1,3,2,4};
	}
}
