def solution(ineq, eq, n, m):
    if ineq == '>' and eq == "=":
        return (n>=m)
    elif ineq == '<' and eq == "=":
        return (n<=m)
    elif ineq == '>' and eq == "!":
        return (n>m)
    elif ineq == '<' and eq == "1":
        return (n<m)