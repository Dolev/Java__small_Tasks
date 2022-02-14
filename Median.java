class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int m=nums1.length;
     int n=nums2.length; 
     double ans_num[]= new double[m+n];  
     double ans=0;
     for (int i=0;i<m+n;i++){
         if(i<m){
             ans_num[i]=nums1[i];
         }
         else{
             ans_num[i]=nums2[i-m];
         }
         
     }  
     int med=n+m/2;
     ans=ans_num[med];
        return ans;
    }
}
