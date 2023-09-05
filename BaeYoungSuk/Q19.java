import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
        Set<Integer> set = new HashSet<>();

        // 회전하면서
        // 길이가 1~element의 길이만큼의 요소들을 set에 넣는다.
        for(int i = 0; i < elements.length; i++){
            int element = 0;
            
            for(int j = i; j < elements.length + i; j++){
                int idx = j;
                if( j >= elements.length){
                    idx = j - elements.length;
                }
                
                element += elements[idx];
                set.add(element);
                
            }
        }
        
        int answer = set.size();
        
        
        return answer;
    }
}
