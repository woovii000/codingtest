class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        for (int num : numbers)
            sum += num;
        double avr = sum/numbers.length;
        return avr;
    }
}