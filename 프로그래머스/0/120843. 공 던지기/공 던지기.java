class Solution {
    public int solution(int[] numbers, int k) {
        // 순서정의 - 규칙
        int n = numbers.length;
        return numbers[2*(k-1)%n];
    }
}