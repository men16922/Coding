package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 주어진 N개의 수에서 다른 두 수의 합으로 표현되는 수가 있다면 그 수를 '좋은 수'라고 한다.
 * N개의 수 중 좋은 수의 총 개수를 출력하시오
 * 1 <= N <= 2000
 */
public class P1253_좋은수 {

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
                    // K는 서로 다른 두 수의 합이어야 함
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
