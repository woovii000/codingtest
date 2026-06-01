def solution(number):
    num = int(number)
    sum = 0
    while num>0:
        if num>10:
            sum += num%10
            num = num//10
        else:
            sum += num
            break
    return sum%9