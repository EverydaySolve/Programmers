from collections import deque

def solution(priorities, location):
    answer = 0
    data = deque(priorities)
    index = deque([i for i in range(len(priorities))])
    cnt = 1
    
    while len(data) != 1:
        temp1 = data.popleft()
        temp2 = index.popleft()
        if max(data) > temp1:
            data.append(temp1)
            index.append(temp2)
        else:
            if temp2 == location:
                break
            cnt += 1
    answer = cnt        
    return answer
