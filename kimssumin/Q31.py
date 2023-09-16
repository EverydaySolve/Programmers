
def solution(numbers, target):
    answer = dfs(numbers, 0, 0, target)
    return answer

def dfs(nums, cnt, now, t):
    ans = 0
    if cnt == len(nums):
        if now == t: 
            return 1
        else: 
            return 0
    ans += dfs(nums, cnt+1, now + nums[cnt], t)
    ans += dfs(nums, cnt+1, now - nums[cnt], t)
    return ans
