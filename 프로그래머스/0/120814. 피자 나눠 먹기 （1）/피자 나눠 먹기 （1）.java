class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = n/7;  //피자 기본수
        if(n%7 != 0)
            answer +=1; // 나머지 있다 없다 +1
        return answer;
    }
}