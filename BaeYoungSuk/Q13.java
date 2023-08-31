import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int cur = n;

        // n이 0이 될 때까지
        while(!(n == 0)){
            
            // n이 홀수이면
            if((n&1) == 1){
                
                // n을 하나 빼고
                n--;
                
                // ans를 하나 추가한다.
                ans++;
            } else {
                
                // 아니면 절반 나눈다.
                n = n >> 1;
            }
        }

        return ans;
    }
}
