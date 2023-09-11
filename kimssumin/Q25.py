def solution(clothes):
    answer = 1
    cl_dic = {}
    for c in clothes:
        if (c[1] in cl_dic):
            cl_dic[c[1]] += 1
        else:
            cl_dic[c[1]] = 1
    for case in cl_dic:
        answer *= (cl_dic[case]) + 1
    
    return answer - 1
