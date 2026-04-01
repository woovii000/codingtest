import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();// 입력받기
        //대문자-소문자 변환 -> String 개별값 못 받음
        // 글자 하나씩 -> char
        // 쪼개기+for문
        String answer = "";
        for(char ch : str.toCharArray()){
            //char 1개씩 대소문자 변환 (if 사용). 변환메소드
            //합치기
            if(Character.isUpperCase(ch)){
                answer += Character.toLowerCase(ch);
            } else{
                answer += Character.toUpperCase(ch);
            }
        }
        System.out.println(answer);
    }
}