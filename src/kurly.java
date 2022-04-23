import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Hamburger implements Comparable<Hamburger>{
	public int eatTime;
	
	public int warmTime;
	
	public Hamburger(int eatTime, int warmTime) {
		this.eatTime = eatTime;
		this.warmTime = warmTime;
	}

	@Override
	public int compareTo(Hamburger o) {
		// TODO Auto-generated method stub
		if(this.warmTime == o.warmTime) return this.eatTime - o.eatTime;
		else return this.warmTime - o.warmTime;
	}
	
	
}

public class kurly {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int [] eatTime = new int[n];
		int [] warmTime = new int[n];
		
		for(int i = 0; i < n; i++) {
			eatTime[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			warmTime[i] = sc.nextInt();
		}
		
		List<Hamburger> hList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			hList.add(new Hamburger(eatTime[i], warmTime[i]));
		}
		
		Collections.sort(hList);
		int answer = 0;
		
		for(int i = 0; i < n; i++) {

			Hamburger hamburger = hList.get(i);
			
			if(i == 0) {
				answer += hamburger.warmTime;
			}
//			System.out.println(hamburger.eatTime + "," + hamburger.warmTime);
			answer += hamburger.warmTime;
		}
		

		
		System.out.println(answer);
		
	
		// 최소 시간
		// 데우는 시간이 가장 짧은 것부터

		

	}
}