import java.util.*;
class Solution {
    
    static int count;
    static int[] copy;
    static int targetCopy;
    
    public int solution(int[] numbers, int target) {
        copy = Arrays.copyOf(numbers, numbers.length);
        count = 0;
        targetCopy = target;
        dfs(0, 0);
 
        return count;
    }
    
    public static void dfs(int depth, int sum){
        if(depth == copy.length){
            if(sum == targetCopy){
                count++;
            }
            return;
        }
        int temp = sum;

        dfs(depth+1, temp - copy[depth]);
        sum += copy[depth];
        dfs(depth+1, temp + copy[depth]);
    }
}
