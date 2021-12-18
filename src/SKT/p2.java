package SKT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p2 {
	public static void main(String[] args) {
		int [] arr = {20,8,10,1,4,15};
	
		Arrays.sort(arr);
		
		int [] arr2 = new int [arr.length];
		
		for(int i = 0; i < arr.length; i+=2) {
			arr2[arr.length/2] = arr[i];
		}
		
		int sum = 0;
		
		for(int i = 1; i < arr.length; i++) {
//			System.out.println(arr[i] + " " + arr[i-1]);
			sum += Math.abs(arr[i] - arr[i-1]);
//			System.out.println(sum);
		}
		System.out.println(sum);
		List<Integer> aList = new ArrayList<>();
		aList.add(sum);
		
	}
}
