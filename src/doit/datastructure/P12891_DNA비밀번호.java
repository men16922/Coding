package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA��й�ȣ {

    static int [] checkArr = new int[4]; // ��й�ȣ üũ �迭
    static int [] myArr = new int[4]; // ���� ���� �迭
    static int checkSecret = 0; // ���� �� ����;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int S = Integer.parseInt(stringTokenizer.nextToken()); // ���ڿ� ũ��
        int P = Integer.parseInt(stringTokenizer.nextToken()); // �κ� ���ڿ� ũ��

        char [] A = new char[S]; // ���ڿ� �迭
        int result = 0;
        A = bufferedReader.readLine().toCharArray();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // ��й�ȣ üũ �迭 ������ ����
        for(int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(checkArr[i] == 0) checkSecret++;
        }

        for(int i = 0; i < P; i++) { // �ʱ� P �κ� ���ڿ� ó�� �κ�
            Add(A[i]);
        }
        if(checkSecret == 4) {
            result++;
        }
        // �����̵� ������ ó�� �κ�
        for(int i = P; i < S; i++) {
            int j = i - P; // �����̵� �������� ù��° �κ�
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) {
                result++;
            }

        }
        System.out.println(result);
        bufferedReader.close();

    }

    /**
     * ���� ���� ���ڸ� ó���ϴ� �Լ�
     * @param c
     */
    static void Add(char c) {
        switch (c) {
            case 'A' :
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;

            case 'C' :
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;

            case 'G' :
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;

            case 'T' :
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }

    /** ���� ���� �Լ� ����
     * @param c
     */
    static void Remove(char c) {
        switch (c) {
            case 'A' :
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;

            case 'C' :
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;

            case 'G' :
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;

            case 'T' :
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}
