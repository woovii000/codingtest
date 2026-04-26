import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String polynomial) {
        //항, 연산자 구분
        String[] atr = polynomial.split(" ");
        int sumx = 0;
        int sumn = 0;
        //짝수idx -> 항 -> contains('x') -> 앞 숫자만 모아서
        //상수끼리 모아서 합
        for(int i=0; i<atr.length; i+=2){
            if(atr[i].contains("x")){ //x만 있는경우 계수1 살리기*
                if(atr[i].equals("x")){
                    sumx +=1;    
                }else {
                    String num = atr[i].replace("x","");
                    sumx += Integer.parseInt(num);
                }  
            }else{
                sumn += Integer.parseInt(atr[i]);
            }
        }
        //x, 상수 각각 합 구하기
        String answer = "";
        if(sumx>0){
            if(sumx == 1){
                answer += "x";
            }else{
                answer += sumx + "x";
            }
        }
        if(sumn>0){
            if (!answer.equals("")) { //상수항 있을 경우*
                answer += " + ";
            }
            answer += sumn;
        }
        //결과 -> 문자열 출력
        return answer;
    }
}