class Solution {
    public int solution(int[] sides) {
        //sides[0,1,2] 중 max 찾기 max<other1+other2
        //만들면 1, 못 만들면 2 return
        int max = 0;
        int[] other = new int[2];
        //sides[0] sides[1] sides[2]
        int sum = sides[0]+sides[1]+sides[2];
        for(int i=0; i<sides.length; i++){
            max = max<sides[i] ? sides[i] : max ;
        }
        return max<sum-max ? 1 : 2;
    }
}