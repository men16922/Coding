package programmers.lv1;


/*
 * 왼손은 *, 오른손은 #에서 시작
 * 키패드에서 상하좌우 4가지 방향으로만 이동
 * 1,4,7은 왼손
 * 3,6,9는 오른손
 * 2,5,8,0은 가까운 손
 * 거리가 같다면 오른손잡이, 왼손잡이에 따라 구부
 */
public class p_keypad {

	public String solution(int[] numbers, String hand) {
        String answer = new String();
        int left=10,right=12;
        for(int number: numbers){
            if(number==0) number=11;
            if(number%3 ==1){
                answer += "L";
                left = number;
            }
            else if(number%3==0){
                answer += "R";
                right = number;
            }
            else {
                int leftLength = getLength(left, number);
                int rightLength = getLength(right, number);
                if(leftLength>rightLength){
                    answer += "R";
                    right = number;
                } 
                else if(leftLength<rightLength){
                    answer += "L";
                    left = number;
                }
                else {
                    if(hand.equals("left")){
                        answer += "L";
                        left = number;
                    }
                    else {
                        answer += "R";
                        right = number;
                    }
                }
            }
        }
        return answer;
    }
    public int getLength(int start, int end){ 
        int x = (start-1)/3;
        int y = (start-1)%3;
        int endX = end/3;
        int endY = 1;
        return Math.abs(x-endX) + Math.abs(y-endY);
    }
}
