package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 재료의 개수 N(1 <= N <= 15,000)
 * 갑옷을 만드는 데 필요한 수 M(1 <= M <=10,000,000)
 * 재료들을 합해서 갑옷을 만들 수 있는 개수
 */
public class P1940_주몽 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 두 포인터를 양쪽 끝에 위치시킨다.
        int start_index = 0;
        int end_index = N - 1;
        int cnt = 0;
        Arrays.sort(arr);

        while(start_index < end_index) {
            // 번호의 합이 M보다 작으면 작은 번호 index를 올린다.
            if(arr[start_index] + arr[end_index] < M) {
                start_index++;

                // 번호의 합이 M보다 크면 큰 번호 index를 내린다.
            } else if(arr[start_index] + arr[end_index] > M) {
                end_index--;
                //번호의 합이 같으면 양쪽 포인터를 모두 이동시키고 cnt를 증가시킨다.
            } else if(arr[start_index] + arr[end_index] == M) {
                start_index++;
                end_index--;
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
