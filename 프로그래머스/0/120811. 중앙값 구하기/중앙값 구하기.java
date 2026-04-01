import java.util.Arrays; //import 필수

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 오름차순정렬 - import 필요
        int answer = 0;
        answer = array[array.length/2]; // 정렬된 배열의 중앙값
        return answer;
    }
}