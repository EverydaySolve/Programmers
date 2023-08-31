import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        while (Math.abs(a-b) != 1 || !isPossible(a,b)) {
            a = change(a);
            b = change(b);
            answer++;
        }
        
        return answer;
    }
    
    public int change(int num) {
        return num%2==0 ? num/2 : num/2+1;
    }
    
    public boolean isPossible(int a, int b) {
        int odd = a%2==0 ? b : a;
        int even = a%2==0 ? a : b;
        return odd < even;
    }
}
