class Solution {
    public int solution(int a, int b) {
        String A = Character.toString((char)a);
        String B = Character.toString((char)b);
        String C = A+B;
        String D = B+A;
        if(C.parseInt() >= D.parseInt()){ return C.parseInt(); }
        else { return D.parseInt();}
    }
}