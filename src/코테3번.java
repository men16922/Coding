
public class 코테3번 {

	public static int solution(int[] gold_prices) {
		int answer = 0;

		/*
		 * 다음날 가격보다 싸면 산다. 샀을 경우 한 칸 넘긴다.
		 */

		for (int i = 0; i < gold_prices.length - 1; i++) {
		

			for (int j = i; j < gold_prices.length; j++) {
				int price = 0;
				if (gold_prices[j] < gold_prices[i]) {
					break;
				}

				if (gold_prices[i] < gold_prices[j]) {
					System.out.println(gold_prices[i] + "," + gold_prices[j]);
					System.out.println((i + 1) + "번쨰 날 : " + price);
					
					if (gold_prices[j] - gold_prices[i] > price) {
						price = gold_prices[j] - gold_prices[i];
						int max = 0;
						int maxcount = 0;
						for(int k = j; k < gold_prices.length; k ++) {
							if(gold_prices[k] < gold_prices[i] ) {
								//System.out.println("맥스"+gold_prices[k]);
								System.out.println(price);
								answer -=k;
								//max = 0;
								//price = 0;
								break;
							}
							if(max < gold_prices[k] - gold_prices[i]) {
								max = gold_prices[k] - gold_prices[i]; 
								maxcount = k;
							}
						}
						if(max > price) {
							j = maxcount;
							price = max;
						}
						i += 2;
						System.out.println(price);
					}

				}

				answer += price;
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		int [] gold_prices = {2, 5, 1, 3, 4};
		//int[] gold_prices = { 7, 2, 5, 6, 1, 4, 2, 8 };

		int answer = solution(gold_prices);
		System.out.println(answer);
	}
}
