class Solution {
    public void moveZeroes(int[] nums) {
       int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            if(nums[low]==0)
            {
                int t=0;
                for(int i=low;i<high;i++)
                {
                    t=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=t;
                }
                high--;
            }
            else
                low++;
        }
        
    }
}
