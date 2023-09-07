import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int[] count = new int[10005];
        int max = Integer.MIN_VALUE;
        int answer = 0;
        
        for(int e : citations){
           for(int i = 0; i <= e; i++){
               count[i]++;
           }
           if(e > max){
               max = e;
           }
        }
       
        for(int i = 0; i < max; i++){
            int H = count[i];
            if(H >= i && H > answer){
                answer= i;
            }
        }
        
        return answer;
    }
}
