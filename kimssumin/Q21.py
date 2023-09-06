def solution(citations):
    citations.sort(reverse=True)
    for idx , citation in enumerate(citations):
        if idx >= citation:
            return idx
    return len(citations)


    #6 5 3 1 0  / 6 1 0 0 0 
    #0 1 2 3 4  / 0 1 2 3 4
