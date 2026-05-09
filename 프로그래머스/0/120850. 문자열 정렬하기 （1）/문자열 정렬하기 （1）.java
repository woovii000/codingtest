import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {

        String nums = "";

        // 숫자만 추출
        for(int i = 0; i < my_string.length(); i++) {

            if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
                nums += my_string.charAt(i);
            }
        }

        // 문자열 길이만큼 배열 생성
        int[] answer = new int[nums.length()];

        // 문자 → 숫자 변환
        for(int i = 0; i < nums.length(); i++) {
            answer[i] = nums.charAt(i) - '0';
        }

        // 오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }
}