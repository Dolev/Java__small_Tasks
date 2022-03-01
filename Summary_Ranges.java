class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> answer = new ArrayList<String>();
        //answer.add("[");
        int difference=0;
        int Iindex=0;
        int Iend=0;
        for(int i=0; i<n; i++){
          for(int j=i+1; j<n; j++){
              Iindex=nums[i];
              difference= nums[j] - nums[i];
              while(difference==1){i++;j++;
                                  difference= nums[j] - nums[i];}
              Iend=i+1;
              answer.add(String.valueOf(nums[Iindex])+"->"+String.valueOf(nums[Iend]));
          }
        }
        return answer;
    }
}
/*difference= nums[i+1] - nums[i];
            if(difference==1){         // -> range
                Iindex=i;
                answer.add(String.valueOf(nums[Iindex])+"->");
                while(nums[i]==nums[i+1]){
                    i++;
                }
                Iend=i+1;
                answer.add(String.valueOf(nums[Iend]));  
            }
            else{
                answer.add(String.valueOf(nums[i])); 
                
            }*/
