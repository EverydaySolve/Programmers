def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a%b)

def solution(num):
    num.sort()
    temp = 1
    for i in range(len(num)):
        temp = (num[i] * temp) / (gcd(num[i], temp))
    return temp
