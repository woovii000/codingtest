class Solution {
    public int solution(int n) {
        int p = 1;
        // 피자판 p
        // 조각수 p*6
        // 조각수 % n = 0 true
        while((p*6) % n !=0){
            //if((p*6) % n ==0)
               // break;
            p++;
        }
        return p;
    }
}