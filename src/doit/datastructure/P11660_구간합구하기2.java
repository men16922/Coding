package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N x N ���� ���� N x N ũ���� ǥ�� ä���� �ִ�.
 * ǥ ���� �� �� (x1, y1)���� (x2, y2)������ ���� ���Ϸ� �Ѵ�. (x�� ��, y�� ��)
 * 1 <= N <= 1024
 * 1 <= M <= 100,000
 * @author men16
 *
 */
public class P11660_�����ձ��ϱ�2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken()); // ǥ�� ũ��
        int M = Integer.parseInt(stringTokenizer.nextToken()); // ���� ���ؾ� �ϴ� Ƚ��
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
                //���� ��
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
