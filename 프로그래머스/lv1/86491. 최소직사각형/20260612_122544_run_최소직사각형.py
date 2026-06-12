def solution(sizes):
    # 가로 세로 비교 정렬
    # 정렬한 길이들로 가장 큰거 정하기
    for a, b in sizes:
        low, high = min(a,b), max(a,b)
        a, b = low, high 
    ga = []
    se = []
    for i in range(len(sizes)):
        ga.append(sizes[i][0])
        se.append(sizes[i][1])
    return max(ga)*max(se)