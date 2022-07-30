package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * ����� ���� N(1 <= N <= 15,000)
 * ������ ����� �� �ʿ��� �� M(1 <= M <=10,000,000)
 * ������ ���ؼ� ������ ���� �� �ִ� ����
 */
public class P1940_�ָ� {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // �� �����͸� ���� ���� ��ġ��Ų��.
        int start_index = 0;
        int end_index = N - 1;
        int cnt = 0;
        Arrays.sort(arr);

        while(start_index < end_index) {
            // ��ȣ�� ���� M���� ������ ���� ��ȣ index�� �ø���.
            if(arr[start_index] + arr[end_index] < M) {
                start_index++;

                // ��ȣ�� ���� M���� ũ�� ū ��ȣ index�� ������.
            } else if(arr[start_index] + arr[end_index] > M) {
                end_index--;
                //��ȣ�� ���� ������ ���� �����͸� ��� �̵���Ű�� cnt�� ������Ų��.
            } else if(arr[start_index] + arr[end_index] == M) {
                start_index++;
                end_index--;
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
