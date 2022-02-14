class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n= nums.length;
    Arrays.sort(nums);
    HashSet<ArrayList<Integer>> hSet = new HashSet<ArrayList<Integer>>();
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            for (int k = j + 1, l = n - 1; k < l;) {
                int sum = nums[i] + nums[j] + nums[k] + nums[l];
                if (sum > target) {
                    l--;
                }
                else if (sum < target) {
                    k++;
                }
                else if (sum == target) {
                    ArrayList<Integer> found = new ArrayList<Integer>();
                    found.add(nums[i]);
                    found.add(nums[j]);
                    found.add(nums[k]);
                    found.add(nums[l]);
                    if (!hSet.contains(found)) {
                        hSet.add(found);
                        result.add(found);
                    }

                    k++;
                    l--;

                }
            }
        }
    }
    return result;
    }
}
