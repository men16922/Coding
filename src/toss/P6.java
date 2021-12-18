public class P6 {
    public static void main(String[] args) {


    }

    public int solution(int N) {

        int[] stairs = new int[N + 1];
        stairs[0] = 0;
        stairs[1] = 1;
        stairs[2] = 2;
        stairs[3] = 4;
        for (int i = 4; i <= N; i++) {
            stairs[i] = stairs[i-1] + stairs[i-2] + stairs[i-3];
        }

        return stairs[N];
    }

}

