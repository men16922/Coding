
public class ����3�� {

	public static int solution(int[] gold_prices) {
		int answer = 0;

		/*
		 * ������ ���ݺ��� �θ� ���. ���� ��� �� ĭ �ѱ��.
		 */

		for (int i = 0; i < gold_prices.length - 1; i++) {
		

			for (int j = i; j < gold_prices.length; j++) {
				int price = 0;
				if (gold_prices[j] < gold_prices[i]) {
					break;
				}

				if (gold_prices[i] < gold_prices[j]) {
					System.out.println(gold_prices[i] + "," + gold_prices[j]);
					System.out.println((i + 1) + "���� �� : " + price);
					
					if (gold_prices[j] - gold_prices[i] > price) {
						price = gold_prices[j] - gold_prices[i];
						int max = 0;
						int maxcount = 0;
						for(int k = j; k < gold_prices.length; k ++) {
							if(gold_prices[k] < gold_prices[i] ) {
								//System.out.println("�ƽ�"+gold_prices[k]);
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
