class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        
        // 남은 사람이 1이 될떄까지 반복한다.
        while(n != 1){
            
            // a와 b의 다음 라운드 순번을 찾는다.
            a = (a+1) >> 1;
            b = (b+1) >> 1;
            
            // 만약 다음 라운드 순번이 같다면 종료
            if(a == b){
                break;
            }
           
            n = n >> 1;
            answer++;
        }

        return answer;
    }
}
