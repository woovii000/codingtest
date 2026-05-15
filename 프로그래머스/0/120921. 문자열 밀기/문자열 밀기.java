import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String A, String B) {
        //String의 앞자 내용을 정해두고 뺀 뒤 - 뒤에 넣기 - 비교
        List<Character> a = new ArrayList<>();
        List<Character> b = new ArrayList<>();
        for(int i=0; i<A.length(); i++){
            a.add(A.charAt(i));
            b.add(B.charAt(i));
        }
        int answer = -1;
        int count = 0;
        for(int i=0; i<A.length(); i++){
            if(a.equals(b)){
                answer = count;
                break;
            }
            a.add(0, a.get(A.length()-1));
            a.remove(A.length());
            count++;
        }
        return answer;
    }
}