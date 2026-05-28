class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min_value = 0;
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<queries[i][1]+1; j++){
                   min_value = Math.min(k,arr[j]);
                }
            }
            if(min_value != k){
                answer[i] = min_value;
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}