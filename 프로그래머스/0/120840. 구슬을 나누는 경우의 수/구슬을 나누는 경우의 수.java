import java.math.BigInteger;
import java.util.*;

class Solution {
    public int solution(int balls, int share) {
        //집합-특정 갯수 뽑기 => 조합 nCr = n! / (r! (n-r)!); 공부
        BigInteger b = new BigInteger("1"); //문자열로 숫자
        BigInteger s = new BigInteger("1");
        BigInteger bs = new BigInteger("1");
        //펙토리얼 구현-> 숫자 넣기 . 곱하기.자체함수로.math -> String 
        // A.add(B) A.subtract(B) A.multiply(B) A.divide(B) A.remainder(B)
        //n! r! (n-r)! 숫자
        for(int i = 1; i<=balls; i++){
            b  = b.multiply(BigInteger.valueOf(i));
        }
        for(int i = 1; i<=share; i++){
            s  = s.multiply(BigInteger.valueOf(i));
        }
        for(int i = 1; i<=balls-share; i++){
            bs  = bs.multiply(BigInteger.valueOf(i));
        }
        bs = bs.multiply(s);
        b = b.divide(bs);
        int answer = b.intValue();
        return answer;
    }
}