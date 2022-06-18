package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Stage implements Comparable<Stage> {
    public int id;
    public double failure;

    public Stage(int id_, double failure_) {
        id = id_;
        failure = failure_;
    }

    @Override
    public int compareTo(Stage o) {
        if (failure < o.failure ) {
            return -1;
        }
        if (failure > o.failure ) {
            return 1;
        }
        return 0;
    }
}

public class p_failureRate {
	
	
	public static int[] solution(int N, int[] lastStages) {
        int nPlayers = lastStages.length;
        int[] nStagePlayers = new int[N + 2];
        for (int stage : lastStages) {
            nStagePlayers[stage] += 1;
        }

        int remainingPlayers = nPlayers;
        List<Stage> stages = new ArrayList<>();
        for (int id = 1 ; id <= N; id++) {
            double failure = (double) nStagePlayers[id] / remainingPlayers;
            remainingPlayers -= nStagePlayers[id];

            Stage s = new Stage(id, failure);
            stages.add(s);
        }
        Collections.sort(stages, Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stages.get(i).id;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int N = 4; // 스테이지의 개수
		int [] stages = {5, 5, 5, 5, 5}; // 사용자가 현재 도전 중인 스테이지의 번호
		// N + 1은 마지막 스테이지까지 클리어한 사용자(예시 : 6)
		// 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지를 앞에
		// 스테이지에 도달한 유저가 없으면 해당 스테이지의 실패율은 0
		// 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
		
		for(int i :solution(N, stages)) {
			System.out.println(i);
		}
	}

}
