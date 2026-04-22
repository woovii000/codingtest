class Solution {
    public int solution(int[] array) {
        String seven = "";
        int answer=0;
        for(int i=0; i<array.length; i++){
            seven += array[i];
        }
        for(int i=0; i<seven.length(); i++){
            if(seven.charAt(i)=='7') answer+=1;
        }
        return answer;
    }
}