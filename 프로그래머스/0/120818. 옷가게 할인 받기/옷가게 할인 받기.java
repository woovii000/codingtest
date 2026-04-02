class Solution {
    public int solution(int price) {
        double p = (double) price;
        if(price >= 500000){
            return (int)(p*0.8);
        }else if(price >= 300000){
            return (int)(p*0.90);
        }else if(price >= 100000){
            return (int)(p*0.95);
        }else{
            return (int)p;
        }
    }
}