package line;

public class p1 {
	public int solution(String s) {
        int answer = 0;

        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�. 
//        System.out.println("Hello Java");
        
        
        /**
         * ���� z ���� a�� �ִ� ��츦 ���Ѵ�.
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
