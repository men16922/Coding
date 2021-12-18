package live;
/**
 * �迭�� �ε����� 0���� �����Ѵٰ� ������ 4���� ��ǥ�� (1,0) �̰� ȸ�� �Ѱ��� ��ǥ�� (0,0) �̶��� �� �� �ִ�.

"5"���� ���÷ε�� (1,1) -> (1,0) ���� �̵��Ͽ���.  ���⼭ ��Ģ�� �߰��Ѵ�.


(1 , 1 ) -> (1 , 0)


���������� ǥ�ŵ� ������ ���� ���ٴ� ��!

 
���� ���������� ǥ���� ���ִ�. ���⼭ 2�� ó�� �迭�� ������ ũ��(���Ʒ��� ũ��)��°��� �˾Ƴ���.
X,Y = (x,y) -> X,Y = (y, 2 - 1 - x)
 * @author men16
 *
 */
public class live_arrayrotate {
	public static void main(String[] args) {
		int[][] map = new int[2][3];

		int p = 1;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = p++;
			}
		}

		for (int d = 0; d < 2; d++) {
			print(map);
			map = rotate(map);
		}
	}

	private static int[][] rotate(int[][] m) {
		int N = m.length;
		int M = m[0].length;
		// ���� ũ�⸸ŭ���� �������ش�.
		int[][] copyMap = new int[M][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				copyMap[j][N - 1 - i] = m[i][j];
			}
		}

		// ���� ���� �迭�� ��ȯ���ش�.
		return copyMap;
	}

	private static void print(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
