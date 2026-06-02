def solution(my_string, is_suffix):
    for i in range(len(my_string)):
        return 1 if is_suffix == my_string[-i:] else 0