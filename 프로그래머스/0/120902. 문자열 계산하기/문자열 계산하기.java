class Solution {
    public int solution(String my_string) {
        //공백 기준으로 나누고, 1,3은 int - 2는 연산자 확인해서 계산
        //함정 찾기 3+2-5+2 가능 짝(int),홀(연산자)
        String[] arr = my_string.split(" ");
        int total = Integer.parseInt(arr[0]);
        for(int i=1; i<arr.length; i+=2){
            switch (arr[i]){
                case "+": 
                    total += Integer.parseInt(arr[i+1]);
                    break;
                case "-":
                    total -= Integer.parseInt(arr[i+1]);
                    break;
            }
        }
        return total;
    }
}