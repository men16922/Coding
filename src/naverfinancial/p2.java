package naverfinancial;

public class p2 {
	public static int[] solution(int n, int jump) {
        int[] answer = {};
        
        int[][] A = new int[n][n];
        int[][] B = new int[n][n]; // 체크되었는지 확인
        
        int K = 2, f = 0;
        int cnt = 1;
        A[0][0] = 1;
        B[0][0] = 1;
        
        while(cnt <= n * n){

    	
        	 // 1. 윗부분
            for(int j=f; j<n-f; j++){
                A[f][j] = K++;
                B[f][j] = 1;
                cnt++;
            }

            // 2. 오른쪽 할당
            int k = f+1;
            for(int i=k; i<n-f; i++){
                A[i][n-f-1] = K++;
                B[i][n-f-1] = 1;
                cnt++;
            }

            // 3. 아래 할당
            k = n-f-2;
            for(int j=k; j>=f; j--){
                A[n-f-1][j] = K++;
                B[n-f-1][j] = 1;
                cnt++;
            }

            // 4. 왼쪽 할당
            k = n-f-2;
            for(int i=k; i>f; i--){
                A[i][f] = K++;
                B[i][f] = 1;
                cnt++;
            }

            f+=1;
        }
        print(n, A);
        print(n, B);
        return answer;
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
	
	public static void main(String[] args) {
		int n = 5; 
		int jump = 3;
		System.out.println(solution(n, jump));
	}
}
