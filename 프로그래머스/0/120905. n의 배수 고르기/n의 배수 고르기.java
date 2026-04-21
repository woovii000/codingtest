import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        //String[] str = numlist.split(", "); //배열은 split 불가
        List<Integer> num = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
              num.add(numlist[i]);  
            }
        }
        int[] answer = new int[num.size()];
        for(int i=0; i<num.size(); i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}