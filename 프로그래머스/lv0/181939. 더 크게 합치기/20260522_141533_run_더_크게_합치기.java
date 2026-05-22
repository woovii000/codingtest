class Solution {
    public int solution(int a, int b) {
        String C = "";
        String D = "";
        C += (char)(a+'0') + (char)(b+'0');
        D += (char)(a+'0') + (char)(b+'0');
        if(Integer.parseInt(C) >= Integer.parseInt(D)){ return Integer.parseInt(D); }
        else { return Integer.parseInt(D);}
    }
}