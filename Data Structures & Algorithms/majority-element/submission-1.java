class Solution {
    public int majorityElement(int[] nums) {
        int maj = 0;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                maj = nums[i];
            }
            if(nums[i]==maj){
                cnt++;
            }else {
                cnt--;
            }
        }
        return maj;
    }
}