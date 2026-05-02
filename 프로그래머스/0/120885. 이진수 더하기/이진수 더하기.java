class Solution {
    public String solution(String bin1, String bin2) {
        /*
        [흐름]
        1. 두 이진 문자열을 끝자리부터 비교 (오른쪽 → 왼쪽)
        2. 각 자리의 값 + carry(올림) 계산
        3. 현재 자리 값 = sum % 2
        4. 다음 자리로 넘길 값 = sum / 2
        5. 결과는 뒤에서부터 쌓이므로 마지막에 reverse
        6. carry가 남아 있으면 끝까지 반영
        */

        StringBuilder sb = new StringBuilder(); // 결과 저장

        int i = bin1.length() - 1; // bin1 끝 인덱스
        int j = bin2.length() - 1; // bin2 끝 인덱스
        int carry = 0; // 올림값

        // 두 문자열을 끝까지 처리하거나 carry가 남아있을 때까지 반복
        while (i >= 0 || j >= 0 || carry != 0) {

            int n1 = (i >= 0) ? bin1.charAt(i) - '0' : 0;
            int n2 = (j >= 0) ? bin2.charAt(j) - '0' : 0;

            int sum = n1 + n2 + carry; // 현재 자리 합

            sb.append(sum % 2); // 현재 자리 결과 (0 또는 1)
            carry = sum / 2;    // 다음 자리로 넘길 값

            i--; // 다음 자리 이동
            j--; // 다음 자리 이동
        }

        return sb.reverse().toString(); // 뒤집어서 반환
    }
}