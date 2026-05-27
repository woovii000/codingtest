def solution(code):
    mode = 0
    answer = []
    for idx in range(len(code)):
        if code[idx] == 1:
            if mode == 0:
                mode = 1
            else:
                mode = 0
        else:
            if mode == 0:
                if idx%2==0:
                    answer.append(code[idx])
            else:
                if idx%2==1:
                    answer.append(code[idx])
    return "".join(answer)