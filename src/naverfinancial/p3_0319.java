package naverfinancial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p3_0319 {

	public static void DFS(int sum, int[] arr){
		
		int n = arr.length;
		
		int[] A = new int[n+1];
		
		for(int i=1; i<=n; i++){
            A[i] = arr[i-1];
        }
			
		int[] D = new int[sum+1];
		for(int i=1; i<=sum; i++){
            D[i] = 64001;
        }
		
		for(int i=1; i<=n; i++){
            for(int j=A[i]; j<=sum; j++){
                if(A[i] == j) D[j] = 1;

                D[j] = Math.min(D[j], D[j-A[i]]+1);
            }
        }
        System.out.println(D[sum]);
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
//
		int [] arr = {1,2,5};
        DFS(18, arr);
        

	}
}
