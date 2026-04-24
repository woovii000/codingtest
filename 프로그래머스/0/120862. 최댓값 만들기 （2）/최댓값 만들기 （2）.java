class Solution {
    public int solution(int[] numbers) {
        //2중 for문 
        int answer = 0;
        int max=Integer.MIN_VALUE; //핵심. 엣지케이스
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(max<numbers[i]*numbers[j])
                    max = numbers[i]*numbers[j]; 
            }
        }
        return max;
    }
}