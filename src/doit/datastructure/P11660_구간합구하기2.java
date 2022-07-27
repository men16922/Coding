package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N x N 개의 수가 N x N 크기의 표에 채워져 있다.
 * 표 안의 수 중 (x1, y1)에서 (x2, y2)까지의 합을 구하려 한다. (x는 행, y는 열)
 * 1 <= N <= 1024
 * 1 <= M <= 100,000
 * @author men16
 *
 */
public class P11660_구간합구하기2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // 표의 크기
        int M = Integer.parseInt(stringTokenizer.nextToken()); // 합을 구해야 하는 횟수
        int [][] A = new int [N + 1][N + 1];
        int [][] D = new int [N + 1][N + 1];

        for(int i = 1 ; i <= N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for(int i = 1 ; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                //구간 합
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }

        for (int k = 0; k < M; k++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1]);
        }

    }
}
