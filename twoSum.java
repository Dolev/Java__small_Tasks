class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int [2];
        int n=nums.length;
        int sum = 0;
        int holder1=0;
        int holder2=0;
        for(int i=0; i<n; i++){
            holder1 = nums[i];
            for(int j=i+1; j<n; j++){
                holder2 = nums[j];
                sum=holder1+holder2;
                if(target==sum){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
            return result;
    }
}
