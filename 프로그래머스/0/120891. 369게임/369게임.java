class Solution {
    public int solution(int order) {
        int count = 0;
        while(order!=0){
            int remainer = order%10;
            if(remainer == 3 || remainer == 6 || remainer == 9) count++;
            order = order/10;
        }
        return count;
    }
}