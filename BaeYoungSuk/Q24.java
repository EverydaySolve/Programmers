// 입출력을 받기 전에 소문자로 바꾸자.

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> list = new LinkedList<>();
        
        for(String e : cities){
            String city = e.toLowerCase();
            if(list.contains(city)) {
                answer++;
                int idx = list.indexOf(city);
                if(idx != 0) {
                    list.remove(city);
                    list.addFirst(city);
                }
                continue;
            }
            
            answer += 5;
            if(list.size() < cacheSize){
                list.addFirst(city);
            } else {
            	if(list.isEmpty()) continue;
                list.removeLast();
                list.addFirst(city);
            }
        }
        
        return answer;
    }
}
