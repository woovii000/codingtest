import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0; i<my_string.length(); i++){
            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9'){ //숫자 골라내기
                list.add((my_string.charAt(i)-'0')); //배열에 넣기 charAt 문자 -> ?? - '0' 하면 숫자값
            }   
        }
        //list -> 배열
        //배열 -> sort(타입 확인)
        //int[] answer = list.toArray(new int[list.size()]); // 불가 list - Integer 객체*
        int[] answer = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}