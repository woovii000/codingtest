import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        // 값 오름차순->내림차순 -> idx값 = 중요도 오름차순 
        int[] sort = new int[emergency.length];
        for(int i=0; i<emergency.length; i++){
            sort[i] = emergency[i];
        }
        Arrays.sort(sort); // 오름차순 정렬
        for(int i=0; i<sort.length/2; i++){ //내림차순 정렬
            int temp = sort[i];
            sort[i] = sort[sort.length-i-1];
            sort[sort.length-i-1] = temp;
        }
        
        int[] answer = new int[emergency.length];
        for (int i = 0; i<emergency.length ; i++){
            for(int j = 0; j<emergency.length ; j++){
               if(emergency[j] == sort[i]){
                    answer[j] = i + 1; // 값 바뀐 후, 동일하면 문제 발생
                    break;
               } 
            }
        }
        return answer;
    }
}