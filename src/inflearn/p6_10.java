package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class p6_10 {

	public int count(int [] arr, int dist) {
		int cnt = 1; // ��ġ�� ���� ������
		int ep = arr[0];
		
		for(int i = 1; i < arr.length; i++) { 
			if(arr[i] - ep >= dist)  {
				cnt++;
				ep = arr[i];
				// dist�� ���� ����� ���� �Ÿ�
			} 
		}
		return cnt;
	}
	
	public int solution(int n, int c, int [] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = arr[n-1];
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(arr, mid) >= c)  {
				// ���� �������� c �̻��̸� ������ ��ȿ
				answer = mid;
				lt = mid + 1;
			} else { // ���� ��ȿ���� �ʴ�, �ʹ� �о c������ ��ġ�� ������.
				rt = mid - 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		p6_10 T = new p6_10();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}
