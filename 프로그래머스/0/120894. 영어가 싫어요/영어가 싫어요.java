class Solution {
    public long solution(String numbers) {
        //0~i까지 탐색 -> 글자가 있어?
        //=> answer += 문자(숫자) -> toString으로 변환
        //substring(s, e) . idx 범위는 i~i+2 / i~i+3 /i~i+4
        //-> 각각 switch로 나눠서 있는지 확인 -> 복잡
        // 더 간단한 경우 -> string / replace
        //String answer = "";
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<nums.length; i++){ //s
           numbers = numbers.replace(nums[i],String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}