class Solution {
    public int majorityElement(int[] nums) {
        int maxcount = 0, maxele = 0;
        if(nums.length == 1)
            return nums[0];
        for(int i = 0;i < nums.length; i++ )
        {
            int count = 0;
            for(int j = i+1;j<nums.length;j++)
                if(nums[i] == nums[j])
                    count++;
            if(count > maxcount){
                maxcount = count;
                maxele = nums[i];
            }
        }
        return maxele;
    }
}