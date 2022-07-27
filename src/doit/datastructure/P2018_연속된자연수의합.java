package doit.datastructure;

import java.util.Scanner;

/**
 * 자연수 N(1<= N <= 10,000,000)을 몇 개의 연속된 자연수의 합으로 나타내는 가짓수를 알고 싶다.
 * 예를 들어, 10을 나타내는 방법은 10, 1+2+3+4
 * 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5
 * 시간 제한 : 2초
 */
public class P2018_연속된자연수의합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        // 변수 초기화
        int sum = 1;
        int cnt = 1;
        int start_index = 1;
        int end_index = 1;

        while(end_index != N) {
            if(sum > N) {
                sum = sum - start_index;
                start_index++;
            } else if (sum < N) {
                sum = sum + end_index;
                end_index++;
            } else if (sum == N) {
                end_index++;
                sum = sum + end_index;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
