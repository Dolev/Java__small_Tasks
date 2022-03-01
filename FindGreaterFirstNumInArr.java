public class HelloWorld{
    public static int FindGreaterFirstNumInArr( int a [] ) {
        int n=a.length;
        int temp=0;
        String curr="";
        for(int i=0;i<n;i++){
            curr=String.valueOf(a[i]);
            if( curr.length() == 1 ){
                 
                //curr=a[i];
                if(a[i]>temp){
                    temp=a[i];
                }
            }
        }
        return temp;
    }

     public static void main(String []args){
        
        int arr []= { 12 , 15 , 17 , 7 , 39 , 321 , 0 , 409};
        System.out.println(FindGreaterFirstNumInArr(arr));
     }
}
