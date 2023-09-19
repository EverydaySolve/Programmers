def solution(phone_book):
    answer = True
    phone_book.sort()
    for idx in range(1, len(phone_book)):
        if phone_book[idx].startswith(phone_book[idx-1]):
            return False
    return answer
