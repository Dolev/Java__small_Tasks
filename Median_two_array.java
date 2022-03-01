class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n,m;
    if(nums1.length>nums2.length){
         n=nums1.length;
         m=nums2.length;
    }
     else{
         m=nums1.length;
         n=nums2.length;  
     } 
    double totSum=0;    
    double sum1=0;
    double sum2=0;
    for(int i=0 ;  i<n; i++){
        sum1 += nums1[i];
        if(i<m) sum2+=nums2[i];
    }
        totSum=(sum1+sum2)/(m+n);
        return totSum;
    }
    
}
