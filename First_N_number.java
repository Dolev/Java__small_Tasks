class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int f_Occurs =1;    //first occurs
        int res=0;
        for(int i=0;i<n;i++){
            if(A[i]==f_Occurs){
                f_Occurs++;
                i=0;
            }
        }
        return f_Occurs;

    }
}
