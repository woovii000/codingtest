class Solution {
    public int solution(int a, int b) {
        String stra = Integer.toString(a); //숫자 -> 글씨 변환
        String strb = Integer.toString(b); 
        String strab = ""; //empty
        int answer = 0;
        if(Integer.parseInt(stra+strb) >= Integer.parseInt(strb+stra)){
            answer = Integer.parseInt(stra+strb); //글자 -> 숫자 변환
        }else{
            answer = Integer.parseInt(strb+stra);
        }
        return answer; //출력
    }
}