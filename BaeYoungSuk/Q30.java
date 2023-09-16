import java.util.*;

class Solution {
    static int K;
    static int[][] map;
    static boolean[] visited;
    static int[] arr;
    static int max;

    public int solution(int k, int[][] dungeons) {
        K = k;
        map = dungeons;
        arr = new int[dungeons.length];
        max = 0;
        visited = new boolean[dungeons.length];
        backtracking(0);
        
        return max;
    }
    
    static void backtracking(int depth){
        if(depth == arr.length){
            int health = K;
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == -1) continue;
                if(visited[arr[i]]) {
                    int min = map[arr[i]][0];
                    int consume = map[arr[i]][1];
                    if(health < min) continue;

                    health -= consume;
                    count++;
                }
            }
            if(count > max){
                max = count;
            }
            
            return;
        }
        
        for(int i = 0; i < map.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            arr[depth] = i;
            backtracking(depth + 1);
            visited[i] = false;
            arr[depth] = -1;
        }
    }
}
