class Solution {
    public int solution(String s) {
        String[] num = s.split(" ");
        int answer = 0;
        for(int i = 0; i<num.length; i++){
            if(num[i].equals("Z")){ //배열 속 값(문자)
                answer -= Integer.parseInt(num[i-1]);
            }else{
                answer += Integer.parseInt(num[i]);
            }
        }
        return answer;
    }
}