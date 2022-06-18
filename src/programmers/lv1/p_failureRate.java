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
		int N = 4; // ���������� ����
		int [] stages = {5, 5, 5, 5, 5}; // ����ڰ� ���� ���� ���� ���������� ��ȣ
		// N + 1�� ������ ������������ Ŭ������ �����(���� : 6)
		// �������� ���� ���������� �ִٸ� ���� ��ȣ�� ���������� �տ�
		// ���������� ������ ������ ������ �ش� ���������� �������� 0
		// ������ = ���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� / ���������� ������ �÷��̾� ��
		
		for(int i :solution(N, stages)) {
			System.out.println(i);
		}
	}

}
