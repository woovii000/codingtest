class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer3 = numer1*denom2 + denom1*numer2; //두 분자의 합
        int denom3 = denom1*denom2; //두 분모의 곱
        // num3 vs den 비교
        int big=0, sml=0;
        if(numer3 >= denom3) {
            big = numer3;
            sml = denom3;
        } else{
            big = denom3;
            sml = numer3;
        }
        // 최대 공약수 찾기 : 유클리드 호제법(GCD)
        int temp = 1;
        while(temp != 0){
            temp = big % sml;
            big = sml;
            sml = temp;
        }
        int[] answer = new int[]{numer3/big, denom3/big};
        return answer;
    }
}