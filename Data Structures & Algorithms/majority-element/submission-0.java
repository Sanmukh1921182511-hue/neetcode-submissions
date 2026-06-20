class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt > n/2){
                return nums[i];
            }
        }
        return -1;
    }
}