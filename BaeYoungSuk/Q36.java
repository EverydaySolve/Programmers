import java.util.*;

class Solution {
    static boolean[] visited;
    static int[][] network;
    static int N;
    
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n+1];
        network = computers;
        N = n;
        
        int answer = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(i);
                answer++;
            }
        }
        return answer;
    }
    
    static void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next = 0; next < N; next++){
                if(network[cur][next] == 0) continue;
                if(visited[next]) continue;
                visited[next] = true;
                queue.offer(next);
            }
        }
    }
}
