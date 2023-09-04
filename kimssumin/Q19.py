def solution(elements):
    answer = set()
    
    for idx, e in enumerate(elements):
        answer.add(e)
        now = e
        for next in range(idx+1, idx+len(elements)):
            
            now += elements[next%(len(elements))]
            answer.add(now)
    return len(answer)
