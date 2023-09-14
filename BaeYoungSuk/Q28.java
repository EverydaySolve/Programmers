import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        
        for(int i = 0; i < priorities.length; i++){
            queue.offer(new int[] {priorities[i], i});
            pq.offer(priorities[i]);
        }

        int answer = 0;
        while(!queue.isEmpty()){
            int[] curArr = queue.poll();
            int cur = curArr[0];
            int curIdx = curArr[1];
            int highest = pq.peek();

            if(cur != highest){
                queue.offer(new int[]{cur, curIdx});
                continue;
            }

            pq.poll();
            answer++;
            
            if(curIdx == location){
                break;
            }
            
            
        }
        
        return answer;
    }
}
