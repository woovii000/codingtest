
class Solution {
    public int solution(int[] array, int n) {
        //각 정수 별 n과의 차이 -> 배열에 정의
        int[] sub = new int[array.length];
        for(int i=0; i<array.length; i++){
            sub[i] = n-array[i];
        }
        //절댓값 만들기 sub > 0 Math.abs?
        for (int i = 0; i < sub.length; i++) {
            sub[i] = Math.abs(sub[i]);
        }
        
        //최솟값(min)인지 확인
        int idx = 0;
        int min = sub[0];
        for(int i=1; i<sub.length; i++){
            if(sub[i]<min){
                min = sub[i];
                idx=i;
            } else if(sub[i]==min){
              if(array[i]<array[idx]){
                  idx=i;
              };  
            }  
        }
        return array[idx];
    }
    
}