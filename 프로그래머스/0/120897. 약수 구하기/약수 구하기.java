import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> num = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0) num.add(i);
        }
        //2자릿수 잘림
        int[] answer = new int[num.size()];
        for(int i=0; i<num.size(); i++){
            answer[i] = num.get(i);
        } 
        return answer;
    }
}