class Solution {
    public int solution(int n) {
        //n이하 합성수 찾기
        int answer = 0;
        for(int i=1; i<=n; i++){
            //i의 각각이 합성수인지 판단 - 1<?<i 제외한 수로 나눠진다
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0) count++;
                if(count==3) {
                    answer++;
                    break;
                } 
            }
        }
        return answer;
    }
}