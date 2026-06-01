def solution(a, b, c, d):
    answer = 0
    # 모두 같을 때
    if a==b and b==c and c==d and d==a:
        answer = 1111*a
    # 
    # 
    # 모두 다를 때
    elif a!=b and b!=c and c!=d and d!=a:
        answer = min(a,b,c,d)
    return answer