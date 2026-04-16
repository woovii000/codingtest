import java.util.Set;
import java.util.HashSet;

class Solution {
    //1. String contains
    //2. String while replace
    //3. String set -> array
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(!answer.contains(String.valueOf(ch))){
                answer += ch;
            }
        }
        return answer;
    }
}