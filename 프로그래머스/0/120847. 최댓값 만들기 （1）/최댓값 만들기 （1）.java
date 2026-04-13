class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        //최댓값 설정 -> 비교해서 가장 크면 넣기 -> 출력
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]*numbers[j]>max){
                    max = numbers[i]*numbers[j];
                }
            }
        }
        return max;
    }
}