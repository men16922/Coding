package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * �־��� N���� ������ �ٸ� �� ���� ������ ǥ���Ǵ� ���� �ִٸ� �� ���� '���� ��'��� �Ѵ�.
 * N���� �� �� ���� ���� �� ������ ����Ͻÿ�
 * 1 <= N <= 2000
 */
public class P1253_������ {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int [] arr = new int [N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr);
        int count = 0;

        for(int k = 0; k < N; k++) {

            int i = 0;
            int j = N - 1;
            int K = arr[k];

            while(i < j) {
                if(arr[i] + arr[j] > K) {
                    j--;
                } else if(arr[i] + arr[j] < K) {
                    i++;
                } else if(arr[i] + arr[j] == K) {
                    // K�� ���� �ٸ� �� ���� ���̾�� ��
                    if(i != k && j != k) {
                        i++; j--; count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }

                }
            }
        }

        System.out.println(count);
    }
}
