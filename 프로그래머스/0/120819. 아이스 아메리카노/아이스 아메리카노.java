class Solution {
    public int[] solution(int money) {
        int cup = money/5500;
        int coin = money%5500;
        int[] answer = {cup,coin};
        return answer;
    }
}