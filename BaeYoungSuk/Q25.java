import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>(); 
        for(String[] clothArr : clothes){
            String type = clothArr[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        for(Integer cloth : map.values()){
            answer *= cloth.intValue() + 1;
        }
        
        return answer - 1;
    }
}
