class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        //0~s-1/s~ovs_l/ovs_l+s
        String answer = "";
        return answer = my_string.substring(0, s)+overwrite_string+ my_string.substring(overwrite_string.length()+s);
    }
}