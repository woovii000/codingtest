class Solution {
    public int solution(int a, int b) {
        String AB = String.valueOf(a)+String.valueOf(b);
        String BA = String.valueOf(b)+String.valueOf(a);
        if(Integer.parseInt(AB)>=Integer.parseInt(BA))
            return Integer.parseInt(AB);
        else
            return Integer.parseInt(BA);
    }
}