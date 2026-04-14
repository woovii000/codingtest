class Solution {
    public String solution(String my_string) {
        //문자 내 모음 제거
        String[] split = my_string.split("a|e|i|o|u");
        //제거 후 생긴 문자열 합치기
        String answer = "";
        for(int i=0;i<split.length; i++){
            answer += split[i];
        }
        return answer;
    }
}