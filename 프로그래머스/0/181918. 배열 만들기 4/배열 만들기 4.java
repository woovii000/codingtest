import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
         // 길이 고정됨** 가변필요 -> Arraylist
        List<Integer> stk = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++){
            if(stk.isEmpty()){
                stk.add(arr[i]);
            }else if((arr[i] > stk.get(stk.size()-1))){ 
                stk.add(arr[i]);
            }else if((arr[i] <= stk.get(stk.size()-1))){
                stk.remove(stk.size()-1);
                i--;
            }                
        }
        int[] answer = new int[stk.size()];       
        for(int i =0; i<stk.size();i++){ //int i : stk - stk 객체일때
            answer[i] = stk.get(i);
        }
        return answer;
    }
}