import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new LinkedList<>();
        Queue<Integer> progressQueue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
            progressQueue.offer(progresses[i]);
        }
        
        for(int i = 0; i < speeds.length; i++){
           speedQueue.offer(speeds[i]); 
        }
        
        int day = 1;
        while(!progressQueue.isEmpty()){
            int count = 0;
            
            if(progressQueue.peek() + (day * speedQueue.peek()) < 100){
                day++;
                continue;
            }
            
            while((!progressQueue.isEmpty()) && (!speedQueue.isEmpty())){
                if(progressQueue.peek() + (day * speedQueue.peek()) < 100) break;
                progressQueue.poll();
                speedQueue.poll();
                count++;
            }
            
            list.add(count);
        }
        
        int[] answer = list.stream()
            .mapToInt(i -> i)
            .toArray();   
          
        return answer;
    }
    
}
