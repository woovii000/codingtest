class Solution {
    public int[] solution(int[] num_list) {
        //어떤걸 쓸지*
        int[] answer = new int[num_list.length];
        //어떻게 구현할지*
        // for (int i : num_list){
        for (int i=0; i<num_list.length; i++){
            answer[i] = num_list[num_list.length-i-1];  //수정  
        }
        return answer;
    }
}