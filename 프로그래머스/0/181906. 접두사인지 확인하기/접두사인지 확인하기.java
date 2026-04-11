class Solution {
    public int solution(String my_string, String is_prefix) {
        char[] ms = my_string.toCharArray();
        char[] ip = is_prefix.toCharArray();
        if(my_string.length()>is_prefix.length()){
            for(int i=0; i<is_prefix.length(); i++){
                if(ms[i]!=ip[i]) return 0;
            }
            return 1;
        }
        return 0;
    }
}