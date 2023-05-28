package doit.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P23_연결요소의개수구하기 {
    ArrayList<Integer> [] A;
    boolean visited[];

    public static void main(String[] args) throws IOException {
        P23_연결요소의개수구하기 P23_연결요소의개수구하기 = new P23_연결요소의개수구하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        P23_연결요소의개수구하기.A = new ArrayList[n + 1]; // 인접 리스트 초기화
        P23_연결요소의개수구하기.visited = new boolean[n + 1];
        for (int i = 1; i < n + 1; i++) {
            P23_연결요소의개수구하기.A[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            P23_연결요소의개수구하기.A[s].add(e); // 양방향 에지이므로 양쪽에 에지 더하기
            P23_연결요소의개수구하기.A[e].add(s);
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!P23_연결요소의개수구하기.visited[i]) {
                count++;
                P23_연결요소의개수구하기.DFS(i);
            }
        }
        System.out.println(count);
    }

    void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) DFS(i); // 연결 노드 중 방문하지 않았던 노드만 탐색
        }
    }
}
