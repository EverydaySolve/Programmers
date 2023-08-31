def solution(n):
    answer = []
    answer.append(1)
    answer.append(2)
    # 1 2 3 5 8
    
    for i in range(2, n):
        answer.append(answer[i-1] + answer[i-2])

    return answer[n-1] % 1234567
