package doit.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {

    static int [] checkArr = new int[4]; // 비밀번호 체크 배열
    static int [] myArr = new int[4]; // 현재 상태 배열
    static int checkSecret = 0; // 충족 수 개수;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int S = Integer.parseInt(stringTokenizer.nextToken()); // 문자열 크기
        int P = Integer.parseInt(stringTokenizer.nextToken()); // 부분 문자열 크기

        char [] A = new char[S]; // 문자열 배열
        int result = 0;
        A = bufferedReader.readLine().toCharArray();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // 비밀번호 체크 배열 각각의 개수
        for(int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(checkArr[i] == 0) checkSecret++;
        }

        for(int i = 0; i < P; i++) { // 초기 P 부분 문자열 처리 부분
            Add(A[i]);
        }
        if(checkSecret == 4) {
            result++;
        }
        // 슬라이딩 윈도우 처리 부분
        for(int i = P; i < S; i++) {
            int j = i - P; // 슬라이딩 윈도우의 첫번째 부분
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
     * 새로 들어온 문자를 처리하는 함수
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

    /** 새로 들어온 함수 제거
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
