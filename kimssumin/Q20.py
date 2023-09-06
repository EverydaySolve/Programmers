
def solution(n, left, right):
    answer = []
    
    # 4 7 14
    # 1 2 3 4 2 2 3 4 3 3 3 4 4 4 4 4 
    for i in range(left,right+1):
        x = i // n # 0 0 0 1 1 1 1 2 2 2 2 3
        y = i % n  # 1 2 3 0 1 2 3 0 1 2 3 0
         # 2 3 4 2 2 3 4 3 
        answer.append(max(x, y) + 1)
    
    return answer
