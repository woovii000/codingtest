class Solution {
    public int solution(int[] sides) {
        //case: 긴변(a),작은변(b1) / 작은변 2개(b1,b2)
        // a<b1+b2* / 경우의 수 count++
        int min = Math.min(sides[0], sides[1]);
        int max = Math.max(sides[0], sides[1]);
        int count = 0;
        for(int i=1; i<min+max; i++){
            if(max-min < i){
                count++; 
            }      
        }
        return count;
    }
}