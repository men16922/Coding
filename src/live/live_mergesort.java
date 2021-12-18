package live;
/**
 * 합병 정렬(merge sort) 알고리즘의 구체적인 개념

하나의 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬한 다음, 두 개의 정렬된 부분 리스트를 합하여 전체가 정렬된 리스트가 되게 하는 방법이다.
병합정렬은 다음의 단계들로 이루어진다.


병합(Divide): 입력 배열을 같은 크기의 2개의 부분 배열로 분할한다.

정복(Conquer): 부분 배열을 정렬한다. 부분 배열의 크기가 충분히 작지 않으면 순환 호출 을 이용하여 다시 분할 정복 방법을 적용한다.

결합(Combine): 정렬된 부분 배열들을 하나의 배열에 합병한다.
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
