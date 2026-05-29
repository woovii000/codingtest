def solution(arr):
    stk = []
    for i in range(len(arr)):
        if not stk:
            stk.append(arr[i])
        else:
            if stk[-1]<arr[i]:
                stk.append(arr[i])
            else:
                stk.remove(stk[-1])
    return stk