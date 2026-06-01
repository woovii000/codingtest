def solution(my_string, queries):
    arr = []
    for ch in my_string:
        arr += ch
    for s, r in queries:
        arr[s], arr[r] = arr[r], arr[s]
    return "".join(arr)