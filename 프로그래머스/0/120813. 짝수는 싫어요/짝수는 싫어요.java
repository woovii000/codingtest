class Solution {
    public int[] solution(int n) {
        int idx =  (n%2==0) ? n/2 : n/2+1 ; //짝.홀 나누고 길이 확인*
        int[] answer = new int[idx];
        for(int i = 0; i <idx; i++){
                answer[i] += (2*i+1);
        } 
        return answer; // 일정갯수 넣기 -> 길이 확인
    }
}