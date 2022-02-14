/*
'.' Matches any single character
'*' Matches zero or more of the preceding element.
- example:
  Input: s = "aa", p = "a*"
  Output: true
  Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
*/
class Solution {
    public boolean isMatch(String s, String p) {
        String check=p;
        char pre='*';
        char sin_ch='.';
        int i=0;
        while(s.charAt(i)==check.charAt(i)){
            if(check.charAt(i)==pre){
                check.replace(pre, check.charAt(i-1));
                i++;
            }
            else if(check.charAt(i)==sin_ch){
                 check.replace(sin_ch, check.charAt(i-1));
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
