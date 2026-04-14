import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

class Solution {
    public int solution(String my_string) {
        //내부 자연수 추출 list
        //list 값 + -> answer
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<my_string.length(); i++){
            if('0'<= my_string.charAt(i) && my_string.charAt(i)<='9'){
                list.add(my_string.charAt(i)-'0');
            }
        }
        int answer = 0;
        for(int i =0; i<list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}