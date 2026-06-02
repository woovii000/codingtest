def solution(intStrs, k, s, l):
    # 슬라이스 s:s+l -> int(슬라이스) > k -> append.
    answer = []
    for str in intStrs:
        if int(str[s:s+l]) > k:
            answer.append(str[s:s+l])
    return answer