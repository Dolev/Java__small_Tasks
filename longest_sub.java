class Solution {
    public int lengthOfLongestSubstring(String s) {
        int counter=0;
        int n=s.length();
        String word=s;
        char f;
        String temp;  
        String  strNew=word;
        while(strNew!=""){
            f=word.charAt(0);
            temp=String.valueOf(f);
            strNew = word.replace(temp, "");
            counter++;
            word=strNew;
        }
        //System.out.println(strNew);
        return counter;
    }
}
