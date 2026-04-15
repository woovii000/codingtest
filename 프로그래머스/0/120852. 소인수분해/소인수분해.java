import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        //소인수분해:소수의 곱으로 표현 -> 소인수 찾기(중복되도, 숫자 1개씩만 출력**)
        // 제한사항: 소인수에서 1 제외
        //소인수 오름차순 -> sort
        //set + for
        Set<Integer> prime = new HashSet<>(); //길이 미정, 순서x
        for(int i=2; i<=n; i++){
            while(n%i==0){  //소인수 확인
                prime.add(i); //없다면 넣기
                n /= i;
            } 
        }
        int[] answer = new int[prime.size()]; //set -> index 없음 ->  반복문

        int i = 0;
        
        for(int value : prime){
            answer[i] = value;
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}