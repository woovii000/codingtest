class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int temp = 0;
        int[] answer = new int[numbers.length];
        if (direction.equals("left")){
            for(int i=0; i<n-1; i++){
                temp = numbers[0];
                answer[i] = numbers[i+1];
            }
            answer[n-1] = temp;
        }else if(direction.equals("right")){
            for(int i=0; i<n-1; i++){
                temp = numbers[n-1];
                answer[i+1] = numbers[i];
            }
            answer[0] = temp;
        }
            
        return answer;
    }
}