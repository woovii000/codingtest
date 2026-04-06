class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        //문자별 나누기 - answer에 문자*n개 넣기
        for(int i=0; i<my_string.length(); i++){
            for (int j=0; j<n;j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}