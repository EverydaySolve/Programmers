// 풀이1
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        // 배열 안 요소의 개수를 세어야하나 배열의 크기가 너무 큼 -> Map 사용
        Map<Integer, Integer> map = new HashMap<>();
        
        // 카운트맵을 만든다.
        for(int e : tangerine){
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        
        // 카운트맵의 키값으로 리스트를 만들고 정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2)-map.get(o1));
        
        int answer = 0;
        
        for(Integer e : list){        
            k -= map.get(e);
            answer++;
            if(k <= 0){
                break;
            }
        }
     
        return answer;
    }
}

// 풀이2
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {

        Integer[] count = new Integer[10000005];
        
        for(int i = 0; i < 10000005; i++){
            count[i] = 0;
        }
        
        for(int e : tangerine){
            count[e]++;
        }
        
        Arrays.sort(count, Collections.reverseOrder());
        
        int answer = 1;
        int index = 0;
        while(k != 0){
            if(count[index] == 0){
                index++;
                answer++;
                continue;
            }
            
            count[index]--;
            k--;
        }

        
        return answer;
    }
}
