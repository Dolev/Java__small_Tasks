class Solution {
     public int lengthOfLongestSubstring(String s) {
      int n = s.length();
     
    // Result
    int res = 0;
     
    for(int i = 0; i < n; i++)
    {
         
        // Note : Default values in visited are false
        boolean[] visited = new boolean[256];
         
        for(int j = i; j < n; j++)
        {
             
            // If current character is visited Break the loop
            if (visited[s.charAt(j)] == true)
                break;
 
            // Else update the result if this window is larger, and mark current character as visited.
            else
            {
                res = Math.max(res, j - i + 1);
                visited[s.charAt(j)] = true;
            }
        }
 
        // Remove the first character of previous window
        visited[s.charAt(i)] = false;
    }
    return res;
    }
}
