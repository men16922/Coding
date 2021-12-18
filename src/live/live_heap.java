package live;

import java.util.PriorityQueue;

/*
 * 힙은 '최솟값 또는 최댓값을 빠르게 찾아내기 위해 완전이진트리 형태로 만들어진 자료구조'다.

위 문장에서 중요한 키워드 3가지가 있다. 바로 '최솟값 또는 최댓값' , '빠르게', '완전이진트리' 이다.
즉, 모든 요소들을 고려하여 우선순위를 정할 필요 없이 부모 노드는 자식노드보다 항상 우선순위가 앞선다는 조건만 만족시키며 완전이진트리 형태로 채워나가는 것이다.
 */
public class live_heap {
	public static void main(String[] args) {
	    
		int[] arr = {3, 7, 5, 4, 2, 8};
		System.out.print(" 정렬 전 original 배열 : ");
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		// 배열을 힙으로 만든다.
		for(int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}
		
		// 힙에서 우선순위가 가장 높은 원소(root노드)를 하나씩 뽑는다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}
		
		
		System.out.print("\n 정렬 후 배열 : ");
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
	}
}
