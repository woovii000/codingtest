def solution(str1, str2):
    answer: str = ""
    for i in len(str1):
        answer += str1[i]
        answer += str2[i]
    return answer