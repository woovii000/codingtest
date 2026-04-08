class Solution {
    public int solution(int n) {
        // 시간 초과
        int answer = 0;
        for(int i=1; i<=n;i++){
            if(n%i == 0) answer++;
        }        
        return answer;
    }
}