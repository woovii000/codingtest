class Solution {
    public String[] solution(String my_str, int n) {
        //Array 길이
        int lgth = my_str.length()/n;
        if(my_str.length()%n != 0) lgth = my_str.length()/n+1;
        String[] answer = new String[lgth];
        //Substring으로 나누기
        for(int i=0; i<lgth; i++){
            if(n*(i+1)>=my_str.length()){
                answer[i] = my_str.substring(n*i);
            }else {
                answer[i] = my_str.substring(n*i,n*i+n);
            }
        }
        return answer;
    }
}