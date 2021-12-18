package live;

import java.util.Scanner;

public class live_snare {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] A = new int[n][n];

        // Filling data.
        int K = 1, f = 0;
        while(K <= n*n){
            // 1. 윗부분
            for(int j=f; j<n-f; j++){
                A[f][j] = K++;
            }

            // 2. 오른쪽 할당
            int k = f+1;
            for(int i=k; i<n-f; i++){
                A[i][n-f-1] = K++;
            }

            // 3. 아래 할당
            k = n-f-2;
            for(int j=k; j>=f; j--){
                A[n-f-1][j] = K++;
            }

            // 4. 왼쪽 할당
            k = n-f-2;
            for(int i=k; i>f; i--){
                A[i][f] = K++;
            }

            f+=1;
        }

        print(n, A);
    }

    public static void print(int n, int[][] array){
        // print
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
