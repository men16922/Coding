package kurly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Container implements Comparable<Container>{
	public int color;
	
	public int width;
	
	public Container(int color, int width) {
		this.color = color;
		this.width = width;
	}

	@Override
	public int compareTo(Container o) {
		return this.width - o.width;
	}
}

public class kurly3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 컨테이너 박스 수
		int height = 0; // 건쿨의 층 수
		
		List<Container> containers = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int cur = sc.nextInt();
			
			int color = 0;
			if(cur > 0) {
				color = 1;
			}
			containers.add(new Container(color, Math.abs(cur)));
		}
		
		Collections.sort(containers);
		Queue<Container> queues = new LinkedList<>();
		
		for(Container container : containers) {
//			System.out.println("색깔 : " + container.color + ", 크기 : " + container.width);
			queues.offer(container);
		}
		
		int curColor = 0;
		
		while(!queues.isEmpty()) {
			Container container = queues.poll();;
//			System.out.println(curColor);
			if(height == 0) {
				curColor = container.color;
				height++;
			} else {
				if(container.color != curColor) {
					height++;
				}
				curColor = container.color;
			}
			
		}
		
		System.out.println(height);
		
	}
}
