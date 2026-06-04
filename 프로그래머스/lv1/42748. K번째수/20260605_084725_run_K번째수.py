def solution(array, commands):
    answer = []
    for i, j, k in commands:
        answer.append(array[i:j+1][k])
    return "".join(answer)