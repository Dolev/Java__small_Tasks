public class HelloWorld{
public static int findFirstNaturalNum(int a[]) {
    int n=a.length;
    int b[]= new int [n];
    int index=1;
    for(int i=0;i<n;i++){
        if(a[i]==index){
        index++;
        i=0;
        }  
    //System.out.println("index: "+index+"a[i]: "+a[i]);
    }
    return index;
}
     public static void main(String []args){
        //System.out.println("Hello World");
        int a[]={1,-3,-400,2};          // return 5 
        
        System.out.println(findFirstNaturalNum(a));
     }
}
