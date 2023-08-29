def solution(people, limit):
    people.sort() #50 50 70 80
    tatda = 0
    #40 40// 40 40//
    start = 0
    end = len(people) - 1
    while(start < end):
        if (people[start] + people[end] <= limit):
            start += 1
            tatda += 1
        end -= 1
    return len(people) - tatda
