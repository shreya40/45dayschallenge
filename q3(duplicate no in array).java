https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          if(arr[nums[i]]==1)
              return nums[i];
            else
            {
                arr[nums[i]]++;
            }
        }
        return 0;
    }
}
