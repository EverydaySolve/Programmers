import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        for(int i = 0; i < triangle.length - 1; i++){
            int[] upper = triangle[i];
            int[] cur = triangle[i+1];
            for(int j = 0; j < cur.length; j++){
                if(j == 0) {
                    cur[j] += upper[0];
                } else if(j == cur.length - 1){
                    cur[j] += upper[upper.length - 1];
                } else {
                    cur[j] += Math.max(upper[j-1], upper[j]);
                }
            }
            triangle[i+1] = cur;
        }
        int max = Integer.MIN_VALUE;
        int[] arr = triangle[triangle.length - 1];
        for(int e : arr) {
            if(e > max){
                max = e;
            }
        }
        return max;
    }
}
