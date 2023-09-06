import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {

        List<Integer> list = new ArrayList<>();
        
        for(Long i = left; i <= right; i++){
            long row = i / n;
            long col = i % n;
            list.add((int) Math.max(row, col) + 1);
        }
           
        int[] arr = list.stream()
            .mapToInt(i -> i)
            .toArray();

        return arr;
    }
}
