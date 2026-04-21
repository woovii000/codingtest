import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] ch = my_string.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        Arrays.sort(ch);
        String answer = new String(ch);
        return answer;
    }
}