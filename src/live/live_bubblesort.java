package live;

public class live_bubblesort {
	 public static void bubbleSort(int[] arr) {
	        final int length = arr.length;
	        for (int i = 0; i < length; i++) {	// �迭�� ���̸�ŭ ���µ�
	            for (int j = 0; j < length - i; j++) {	// 0 ~ size -1����
	                if (j + 1 < length && arr[j] > arr[j + 1]) {	// ������ �ֵ鳢�� ��� ���ϸ鼭 �ڸ���ü
	                    arr[j] = arr[j] + arr[j + 1];	
	                    arr[j + 1] = arr[j] - arr[j + 1];
	                    arr[j] = arr[j] - arr[j + 1];
	                }
	            }
	            // ���� ���
//	            System.out.print(i+"���� ���� ");
//	            for(int x : arr)
//	            	System.out.print(x+" ");
//	            System.out.println();
	        }	        
	 }
	 
	 public static void main(String[] args) {
		int[] arr = {8,54,99,3,2,1,0};
		bubbleSort(arr);
		for(int i : arr)
			System.out.print(i+" ");
	}
}
