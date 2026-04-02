class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // ms~s까지 + ows + ows이후~ms.length까지
        // int ms_l = my_string.length();
        int ows_l = overwrite_string.length();
        
        return my_string.substring(0, s) + overwrite_string + my_string.substring(ows_l+s) ;
    
    }
}