package live;

/**
 * ������
 * @author men16
 *
 */
public class live_quicksort { 
	
	/*
	 * ����Ʈ�� ���ȣ���� �ϴ� �������� �˰�������

	�߰������� ���� ��� �߰������� ���� ���� (�Ǻ�)���� ���

	�������� ����, ū���� ���ʿ� ��ġ�ϵ��� ���� �ڸ��� �ٲ۴�. (����)
	 * ����Ʈ�� ����� ���� pivot���� ����
	 * ���� �ε���(low)�� ��� ���� ��Ű��, �� �ε���(high)�� ��� ���� ��Ű�� ���� while ������
	 * �� �ε����� ���� �����ؼ� ����ĥ ������ �ݺ���ŵ�ϴ�.
	 * ���� �ε���(low)�� ����Ű�� ���� pivot���� ���ؼ� �� ���� ��� �ݺ��ؼ� ���� �ε��� ���� ������ŵ�ϴ�.
	 * (pivot ������ ū�� ������ �ִ� ���� ã�� ����)
	 * �� �ε���(high)�� ����Ű�� ���� pivot ���� ���ؼ� �� ���� ��� �ݺ��ؼ� �� �ε��� ���� ���ҽ�ŵ�ϴ�.
	 * (pivot ������ ������ ������ �ִ� ���� ã�� ����)
	 * �� �ε����� ���� ���� �����ؼ� ����ġġ �ʾҴٸ� ���� �ε���(low)�� ����Ű�� ���� �� �ε���(high)����
	 * ����Ű�� ���� ��ȣ ����(swap)��ŵ�ϴ�. (�߸��� ��ġ�� �ִ� �� ���� ��ġ�� �ٲٱ� ����
	 * ��ȣ ���� ��, ���� ���� ����Ű�� ���� �� �ε����� ���� ���� �������� �� ĭ�� �̵� ��ŵ�ϴ�.
	 * �� �ε����� ���� �����ؼ� ����ġ�� �Ǿ� while ������ �������Դٸ� ���� ��� ȣ���� ���� ��������
	 * �� ���� �ε����� �����մϴ�.
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
