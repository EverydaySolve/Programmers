// stack 사용하자
// 1 <= s <= 1000
// 1000(s 길이) * 1000(최대 회전 횟수)
// = 1000000

import java.util.*;

class Solution {
    public int solution(String s) {
        
        int answer = 0;
        
		for(int i = 0; i < s.length(); i++){
            Stack<Character> stack = new Stack<>();
            
            for(int j = i; j < s.length() + i; j++){
                
                // 회전을 위해서 s의 길이를 넘어가면 s 길이를 뺀다.
                // ex) i = 1000 / s = 999 -> idx = 1
                int idx = j;
                if(j >= s.length()){
                    idx = j - s.length();
                }
                
                // 만약 스택이 비어있으면 지금 인덱스를 추가한다.
                if(stack.empty()) {
                    stack.push(s.charAt(idx));
                    continue;
                }
                
                char cur = s.charAt(idx);
                char peek = stack.peek();

                // 현재 인덱스와 스택의 탑을 비교한다.
                // 만약 둘이 짝이라면 탑을 제거한다.
                if(isMatched(cur, peek)){
                    stack.pop();
                    continue;
                }
                
                // 매치되지 않으면 스택에 push한다.
                stack.push(s.charAt(idx));
            }
            
            // 만약 스택이 비어있으면 answer에 1을 더한다.
            if(stack.empty()) answer++;
        }

        return answer;
    }
    
    static boolean isMatched(char a, char b){
        return ((a == ')' && b == '(') || (a == '}' && b == '{') || (a == ']' && b == '['));
    }
}
