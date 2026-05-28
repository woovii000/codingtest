import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l+1];
        for(int i=0; i<l; i++){
            answer[i] = num_list[i];
        }
        if(num_list[l-1]>num_list[l-2]){
            answer[l+1] = num_list[l-1]-num_list[l-2];
        }else{
            answer[l+1] = num_list[l-1]*2;
        }
        return Array.toString(answer);
    }
}