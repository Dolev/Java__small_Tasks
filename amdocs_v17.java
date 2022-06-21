
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n =A.length;
        double sum=0;
        double curr=0;
        for(int i=0;i<n;i++){
            curr=A[i]*Math.pow(10, i);
            sum+=curr;
        }
        int int_sum=(int)sum;
        int Mul_ST=17*int_sum;
        int ans=0;
        int digit=0;
        while(Mul_ST > 0)  
        {     
        digit = Mul_ST % 10;  
        ans = ans + digit;  //adds last digit to the variable ans             
        Mul_ST = Mul_ST / 10; //removes the last digit 
        } 

        return ans;
    }
}
