class Solution {
    public String solution(String my_string) {
        String answer = "";
        Character chr = 'a';
        for(int i=0; i<my_string.length(); i++){
            chr = my_string.charAt(i);
            if(Character.isUpperCase(chr)){
                chr = Character.toLowerCase(chr);
                
            }else{
                chr = Character.toUpperCase(chr);
            }
            answer += chr;
        }
        return answer;
    }
}