import java.util.Arrays;
class Solution {
    public int solution(int[] array, int height) {
        int last=0;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(height < array[i]){
                last = array.length-i;
                break;
            }
        }
        return last;
    }
}