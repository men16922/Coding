package live;
/**
 * �պ� ����(merge sort) �˰����� ��ü���� ����

�ϳ��� ����Ʈ�� �� ���� �յ��� ũ��� �����ϰ� ���ҵ� �κ� ����Ʈ�� ������ ����, �� ���� ���ĵ� �κ� ����Ʈ�� ���Ͽ� ��ü�� ���ĵ� ����Ʈ�� �ǰ� �ϴ� ����̴�.
���������� ������ �ܰ��� �̷������.


����(Divide): �Է� �迭�� ���� ũ���� 2���� �κ� �迭�� �����Ѵ�.

����(Conquer): �κ� �迭�� �����Ѵ�. �κ� �迭�� ũ�Ⱑ ����� ���� ������ ��ȯ ȣ�� �� �̿��Ͽ� �ٽ� ���� ���� ����� �����Ѵ�.

����(Combine): ���ĵ� �κ� �迭���� �ϳ��� �迭�� �պ��Ѵ�.
 * @author men16
 *
 */
public class live_mergesort {
	 public static int[] src;
	    public static int[] tmp;
	    public static void main(String[] args) {
	        src = new int[]{1,9,8,5,4,2,3,7,6};
	        tmp = new int[src.length];
//	        printArray(src);
	        mergeSort(0, src.length - 1);
	        printArray(src);
	    }
	    public static void mergeSort(int start, int end) {
	        if (start < end) {
	            int mid = (start + end) / 2;
	            mergeSort(start, mid);
	            mergeSort(mid + 1, end);
	            int p = start;
	            int q = mid + 1;
	            int idx = p;
	            while (p <= mid || q <= end) {
	                if (q > end || (p <= mid && src[p] < src[q])) {
	                    tmp[idx ++] = src[p ++];
	                } else {
	                    tmp[idx ++] = src[q ++];
	                }
	            }
	            for (int i = start; i <= end; i ++) {
	                src[i] = tmp[i];
	            }
	        }
	    }
	    public static void printArray(int[] a) {
	        for (int i = 0; i < a.length; i ++) 
	            System.out.print(a[i] + " ");
	        
	        System.out.println();
	    }
}
