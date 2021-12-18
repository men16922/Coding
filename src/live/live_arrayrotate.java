package live;
/**
 * 배열의 인덱스는 0부터 시작한다고 했을때 4번의 좌표는 (1,0) 이고 회전 한곳에 좌표는 (0,0) 이란걸 알 수 있다.

"5"번을 예시로들면 (1,1) -> (1,0) 으로 이동하였다.  여기서 규칙을 발견한다.


(1 , 1 ) -> (1 , 0)


빨간색으로 표신된 영역이 서로 같다는 것!

 
따라서 다음과같이 표현할 수있다. 여기서 2는 처음 배열의 세로의 크기(위아래의 크기)라는것을 알아낸다.
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
		// 돌린 크기만큼으로 생성해준다.
		int[][] copyMap = new int[M][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				copyMap[j][N - 1 - i] = m[i][j];
			}
		}

		// 새로 돌린 배열로 반환해준다.
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
