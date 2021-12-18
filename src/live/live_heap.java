package live;

import java.util.PriorityQueue;

/*
 * ���� '�ּڰ� �Ǵ� �ִ��� ������ ã�Ƴ��� ���� ��������Ʈ�� ���·� ������� �ڷᱸ��'��.

�� ���忡�� �߿��� Ű���� 3������ �ִ�. �ٷ� '�ּڰ� �Ǵ� �ִ�' , '������', '��������Ʈ��' �̴�.
��, ��� ��ҵ��� ����Ͽ� �켱������ ���� �ʿ� ���� �θ� ���� �ڽĳ�庸�� �׻� �켱������ �ռ��ٴ� ���Ǹ� ������Ű�� ��������Ʈ�� ���·� ä�������� ���̴�.
 */
public class live_heap {
	public static void main(String[] args) {
	    
		int[] arr = {3, 7, 5, 4, 2, 8};
		System.out.print(" ���� �� original �迭 : ");
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		// �迭�� ������ �����.
		for(int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}
		
		// ������ �켱������ ���� ���� ����(root���)�� �ϳ��� �̴´�.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}
		
		
		System.out.print("\n ���� �� �迭 : ");
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
	}
}
