class Solution {
    public int reverse(int x) {
        int res=0;
        int length;
        if(x>0) { length= String.valueOf(x).length();}
        else {
            length = String.valueOf(x).length()-1;
        }
        int arr[]= new int [length];
        for(int i=0; i<length;i++){
            arr[i]=x%10;
            x=x/10;
            if(i==length-1){
                res+=arr[i];
            }else{
                res+=arr[i]*(Math.pow(10, length-i-1));
            }
            
        }
        String ans=Arrays.toString(arr);
        //System.out.println("Integer Array: " + ans);  
        return res;
    }
}
