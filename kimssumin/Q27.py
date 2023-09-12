def solution(progresses, speeds):
    answer = []
    remain_day = []
    for idx in range(len(progresses)):
        if (100 - progresses[idx]) % speeds[idx] == 0:
            day = (100 - progresses[idx]) // speeds[idx]
            remain_day.append(day)
        else:
            day = (100 - progresses[idx]) // speeds[idx] + 1
            remain_day.append(day)
    base_idx = 0
    for i in range(len(remain_day)):
        if remain_day[base_idx] < remain_day[i]: 
             # 둘의 차이 = 배포 개수
            answer.append(i - base_idx)
            base_idx  = i 

    answer.append(len(remain_day) - base_idx)

    return answer
