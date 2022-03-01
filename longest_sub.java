class Solution {
     public int lengthOfLongestSubstring(String s) {
        int counter=1;
        int n=s.length();
        String word=s;
        char f;
        char f1;
        int j=0; 
        String temp="";  
        for(int i=j+1;i<n;i++){
            f=word.charAt(j);
            f1=word.charAt(i);
            if(f!=f1){
                if(!temp.contains(f)) temp+=f;
                if(!temp.contains(f1)) temp+=f1;
                counter++;
            }
            else{
                if(!temp.contains(f)) temp+=f;
            }
        }
        return counter;
    }
}
