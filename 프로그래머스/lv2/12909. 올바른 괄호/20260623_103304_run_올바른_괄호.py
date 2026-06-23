def solution(s):
    # ( 만나면 스택 )만나면 지우면서 (팝
    # ) 시작 -> false
    for i in range(len(s)):
        if s[0] == ")":
            return False
        
    return True