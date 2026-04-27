class Solution {
    public int solution(String my_string) {
        //1<= my_string[i] <=9 확인 + my_string[i+1]도 그런지 확인
        int sum = 0;
        String n = "";
        for(int i=0; i<my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){ //1-9사이인지
                n += my_string.charAt(i);
                if(i==my_string.length()-1){
                    sum += Integer.parseInt(n);
                }
            }else{
                if(!n.isEmpty()){
                    sum += Integer.parseInt(n);
                    n = "";    
                }
            }
        }
        return sum;
    }
}