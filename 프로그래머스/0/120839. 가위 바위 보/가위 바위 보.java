class Solution {
    public String solution(String rsp) {
        //모두 이기기
        String answer = ""; // 리턴 변수
        char[] rsp_ch = rsp.toCharArray();
        for(int i = 0; i < rsp.length(); i++){
            if(rsp_ch[i] == '0'){ answer += 5; }
            else if(rsp_ch[i] == '2'){ answer += 0; }
            else if(rsp_ch[i] == '5'){ answer += 2; }
        }
        return answer;
    }
}