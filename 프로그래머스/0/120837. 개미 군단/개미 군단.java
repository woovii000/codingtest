class Solution {
    public int solution(int hp) {
        //장군5 병정3 일1 | 적23 -> 최소 병력; 장군4 병정1
        // 최소 병력수
        int count = 0;
        int[] ant = {5,3,1};
        for(int i : ant){
            if(hp%i == 0){
                count += hp/i;
                break;
            }else{
                count += hp/i;
                if(hp%i!=0){ hp = hp%i; } //체력 뺀 나머지
            }
        }
        
        return count;
    }
}