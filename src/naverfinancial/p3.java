package naverfinancial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class p3 {
	
	class Tester {
		String tno; // 수험번호
		ArrayList<String> qno; // 문제번호
		ArrayList<String> score; // 문제점수
		
		
		public Tester(String tno) {
			super();
			this.tno = tno;
			this.qno = new ArrayList<String>();
			this.score = new ArrayList<String>();
		}

		
		public String getTno() {
			return tno;
		}


		public void setTno(String tno) {
			this.tno = tno;
		}

		
		public void addQno(String qno) {
			this.qno.add(qno);
		}
		
		public void addScore(String score) {
			this.score.add(score);
		}
		
		public ArrayList<String> getQno() {
			return qno;
		}

		public ArrayList<String> getScore() {
			return score;
		}
		
	}
	
	public String[] solution(String[] logs) {
        String[] answer = {};
        
        ArrayList<String> testList = new ArrayList<>(); // 수험자리스트
        
        for(String s : logs) { 
        	String [] str = s.split(" ");
        	if(!testList.contains(str[0])) {
        		testList.add(str[0]);
        	}
        	
        }
        Tester[] tester = new Tester[testList.size()]; // 수험자 클래스
        
        for(int i = 0; i < testList.size(); i++) {
        	tester[i] = new Tester(testList.get(i));
        }
        
        for(String s : logs) { 
        	String [] str = s.split(" ");
        	
        	for(int i = 0; i < tester.length; i++) {
        		if(str[0].equals(tester[i].getTno())) {
        			int idx = tester[i].getQno().indexOf(str[1]);
        			if(idx !=-1) { // 문제를 이전에 푼 적이 있으면
        				tester[i].getScore().set(idx, str[2]);
        			} else {
        				tester[i].addQno(str[1]); // 문제번호
            			tester[i].addScore(str[2]); // 문제점수
        			}
        			
        		}
        	}
        }
//        ArrayList<String> qno = tester[0].getQno();
//        for(String s : qno) {
//        	System.out.println(s);
//        }
        
        HashSet<String> badguys = new HashSet<>(); // 부정행위자
        
        for(int i = 0; i < tester.length; i++) {
        	String tno = tester[i].getTno();
        	ArrayList<String> qno = tester[i].getQno();
        	ArrayList<String> score = tester[i].getScore();
        	
        	for(int j = i + 1; j < tester.length; j++) { // 다음 수험자

        		String tno2 = tester[j].getTno();
        		ArrayList<String> qno2 = tester[j].getQno();
            	ArrayList<String> score2 = tester[j].getScore();
            	
            	if(qno.size() == qno2.size() && qno.size() >=5) { // 두 수험자가 푼 문제 수가 같고
            		if(qno.containsAll(qno2)) { // 같은 문제를 풀고
            			if(score.containsAll(score2)) { // 점수가 같으면
            				// 부정행위자
            				badguys.add(tno);
            				badguys.add(tno2);
            			}
            		}
            	}
            	
            	
        	}
        	
        	
        	
    	}
        

        
        answer = badguys.toArray(new String[0]);
        
        Arrays.sort(answer);
        
        if(answer.length == 0) {
        	String [] ans = {"None"};
        	return ans;
        }
        
        for(String s : answer) {
        	System.out.println(s);
        }
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		p3 p3 = new p3();
		
		//수험번호 문제번호 점수
		String [] logs = {"1901 10 50", "1909 10 50"};
		System.out.println(p3.solution(logs));
	}
}
