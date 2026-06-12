def solution(n, lost, reserve):
    # lost.value == reserve.value => 제외(pop)
    # lost.value+-1 == reserve.value => 제외(pop)
    # n - len(lost)
    lost.sort()
    reserve.sort()
    # 도난 + 여벌 유저
    for x in lost[:]:
        if x in reserve[:]:   
            lost.remove(x)
            reserve.remove(x)
    # 여벌옷 빌려주기
    for x in lost[:]:
        if x-1 in reserve[:]:
            lost.remove(x)
            reserve_c.remove(x-1)
        elif x+1 in reserve_c:
            lost.remove(x)
            reserve_c.remove(x+1)
    return n-len(lost)