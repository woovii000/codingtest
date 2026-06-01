def solution(my_string, queries):
    arr = list(my_string)
    for s, r in queries:
        for i in range(0,(s+r)//2):
            arr[s+i], arr[r-i] = arr[r-i], arr[s+i]
    return "".join(arr)