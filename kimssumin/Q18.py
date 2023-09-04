def check(test):
    stack = []
    for t in test:
        if (t == "(" or t == "{" or t == "["):
            stack.append(t)
        else:
            if (len(stack) == 0):
                return False
            before = stack.pop()
            if (t == "]" and before != "["):
                return False
            if (t == ")" and before != "("):
                return False
            if (t == "}" and before != "{"):
                return False
    if (len(stack) == 0):
        return True


def solution(s):
    answer = 0
    total_b = len(s)
    origin_s = list(s)
    
    for i in range(total_b):
        first = s[i:]
        second = s[:i]
        now_s = first + second
        
        if (check(now_s)):
            answer += 1
    return answer
