import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minpq = new PriorityQueue<>((o1, o2) -> o1 - o2);
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        
        for(String e : operations){
            StringTokenizer st = new StringTokenizer(e);
            String command = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            if(command.equals("I")){
                minpq.offer(num);
                maxpq.offer(num);
            } else if (command.equals("D")){
                if(num == 1 && !maxpq.isEmpty()){
                    int target = maxpq.poll();
                    minpq.remove(target);
                } else if(num == -1 && !minpq.isEmpty()){
                    int target = minpq.poll();
                    maxpq.remove(target);
                }
            }
        }
        
        int[] answer = new int[2];
        if(!maxpq.isEmpty()){
            answer[0] = maxpq.poll();
            answer[1] = minpq.poll();
        } else {
            answer[0] = 0;
            answer[1] = 0;
        }
        
        return answer;
    }
}
