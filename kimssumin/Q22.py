## solve - 1 - success
from collections import Counter

def check(now_discount, want_zip):
    discount_info = Counter(now_discount)
    for w in want_zip:
        if (discount_info[w] < want_zip[w]):
            return False
    return True

def solution(want, number, discount):
    answer = 0
    total_day = len(discount)
    want_zip = {}
    for w, n in zip(want, number):
        want_zip[w] = n

    for i in range(total_day - 9):
        if (check(discount[i:i+10] , want_zip)):
            answer += 1
        
        
    return answer



## solve - 2 -fail
from collections import Counter

def check(now_discount, want_zip):
    discount_info = Counter(now_discount)
    for w in want_zip:
        if (discount_info[w] < want_zip[w]):
            return False
    return True

def solution(want, number, discount):
    answer = 0
    total_day = len(discount)
    end_date_idx = total_day - 10
    want_zip = {}
    for w, n in zip(want, number):
        want_zip[w] = n

    while(end_date_idx >= 0):
      if (not check(discount[end_date_idx:end_date_idx+10] , want_zip)):
          break
      answer += 1
      end_date_idx -= 1
    
    return answer
