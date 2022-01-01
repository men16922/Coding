package line;

public class p1 {
	public int solution(String s) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 
//        System.out.println("Hello Java");
        
        
        /**
         * 먼저 z 다음 a가 있는 경우를 구한다.
         */
        
        String temp = s;
        
        int first = temp.indexOf("z");
        int second = temp.indexOf("a");

        if(first < second) {
        	while(temp.indexOf("z") != -1) {
            	System.out.println(temp.indexOf("z"));
            	if(temp.indexOf("a") != 1) {
            		System.out.println("ok");
            		temp = temp.substring(temp.indexOf("a") + 1);
            		answer++;
            	} else {
            		temp = temp.substring(temp.indexOf("a") + 1);
//            		System.out.println(temp);
            	}
            	
//            	System.out.println(temp);
            }
        } else {
        	while(temp.indexOf("a") != -1) {
            	System.out.println(temp.indexOf("z"));
            	if(temp.indexOf("z") != 1) {
            		temp = temp.substring(temp.indexOf("z") + 1);
            		answer++;
            	} else {
            		temp = temp.substring(temp.indexOf("z") + 1);
            	}
            	
//            	System.out.println(temp);
            }
        }
        
        
        
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		p1 p = new p1();
		String s = "zabzczxa";
		System.out.println(p.solution(s));
	}
}
