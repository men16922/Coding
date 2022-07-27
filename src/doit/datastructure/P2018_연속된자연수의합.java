package doit.datastructure;

import java.util.Scanner;

/**
 * �ڿ��� N(1<= N <= 10,000,000)�� �� ���� ���ӵ� �ڿ����� ������ ��Ÿ���� �������� �˰� �ʹ�.
 * ���� ���, 10�� ��Ÿ���� ����� 10, 1+2+3+4
 * 15�� ��Ÿ���� ����� 15, 7+8, 4+5+6, 1+2+3+4+5
 * �ð� ���� : 2��
 */
public class P2018_���ӵ��ڿ������� {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        // ���� �ʱ�ȭ
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
