import java.util.Arrays;

class Solution {
    public String solution(String s) {
        //array
        /*
        char[] carr = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            carr[i] = s.charAt(i);
        }
        */
        char[] carr = s.toCharArray(); //문자열 배열화
        Arrays.sort(carr); //오름차순 정렬
        String answer = "";
        /*
        for(int i=0; i<carr.length-1; i++){
            char a = carr[i];
            answer += a; //넣고 나중에 지우는것보다 확인후 넣는 것이 중요.
            for(int j=i+1; j<carr.length; j++){
                if(a == carr[j]){
                    answer.replace(String.valueOf(a),"") ; //마지막idx검사x
                    break;  //중복 여러개 일때 처리 불완전
                } 
            }
        }*/
        
        for(int i=0; i<carr.length; i++){
            boolean isUnique = true;
            if(i>0 && carr[i] == carr[i-1]) {isUnique = false;} //0, 1 비교
            if(i<carr.length-1 && carr[i] == carr[i+1]) {isUnique = false;} //마지막, 마지막 이전 비교
            if(isUnique) {answer += carr[i];}            
        }
        
        return answer;
    }
}