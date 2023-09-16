def solution(triangle):
    answer = 0
    nt = [[0] + t + [0] for t in triangle]
    
    for i in range(1, len(nt)):
        for j in range(1, i+2):
            nt[i][j] += max(nt[i-1][j-1], nt[i-1][j])
    
    return max(nt[-1])
