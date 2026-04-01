class Solution {
    public int[] solution(int n) {
        		int length = 0;
		if(n % 2 == 1)
			length = n / 2 + 1;
		else
			length = n / 2;

		int[] answer = new int[length];
        int count = 0;
        for(int i=1; i<=n; i++){ //배열에 넣기 위한 작업
            //홀수면 배열에 순서대로 넣기
            if(i%2==1){
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }
}