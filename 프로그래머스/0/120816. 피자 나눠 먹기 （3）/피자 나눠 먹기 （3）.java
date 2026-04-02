class Solution {
    public int solution(int slice, int n) {
        int p = 0;
        // 피자조각 slice 2~10
        // n개는 나와야함 -> 피자 몇개?
        // p*slice 전체조각 수/ n 몫이 1이상
        while((p*slice)/n >= 0){
            if((p*slice)/n >= 1){
                break;
            }
            p++;
        }
        return p;
    }
}