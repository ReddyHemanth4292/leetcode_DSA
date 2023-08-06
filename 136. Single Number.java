//using xor operator 
//when we xor two same nums the ans is 0
//so remains number which is not repeated


class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}
