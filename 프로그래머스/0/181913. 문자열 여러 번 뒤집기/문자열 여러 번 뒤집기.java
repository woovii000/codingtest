class Solution {
    public String solution(String my_string, int[][] queries) {
        //문자열 -> 문자 배열(문자열 해당값 부여)
        char[] ms = new char[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            ms[i] = my_string.charAt(i);
        }
        
        //쿼리 1차배열 속 s,e 확인 -> s-e범위 사이의 문자 뒤집기
        for(int i=0; i<queries.length; i++){
            for(int j=0; j < (queries[i][1]-queries[i][0])/2+1; j++){
                char ch = ms[j+queries[i][0]];
                ms[queries[i][0] + j] = ms[queries[i][1] - j];
                ms[queries[i][1] - j] = ch;
            }
        }
        
        // 배열 -> 문자열
        String answer = "";
        for(int i=0; i<ms.length; i++){
            answer += ms[i];
        }
        return answer; //배열 -> string 반환
    }
}