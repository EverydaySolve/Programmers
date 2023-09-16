answer = 0

def solution(k, dungeons):
    global N, visited
    N = len(dungeons)
    visited = [0 for _ in range(N)]
    dfs(k, 0, dungeons)
    return answer


def dfs(k, cnt, dungeons):
    global answer
    answer = max(cnt, answer)
    
    for j in range(N):
        if k >= dungeons[j][0] and not visited[j]:
            visited[j] = 1
            dfs(k - dungeons[j][1], cnt + 1, dungeons)
            visited[j] = 0

