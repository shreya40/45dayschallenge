https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1/#


class GfG
{
    int maxLen(int arr[], int n)
    {
        Map<Integer,Integer> sumlist=new HashMap<>();
        int sum=0;
        int maxlength=0;
        int le;
         for(int i=0;i<arr.length;i++)
         {
             sum=sum+arr[i];
             if(sum==0)
              maxlength=i+1;
             else
             {
             if(sumlist.containsKey(sum))
             {
                le=i-sumlist.get(sum);
                if(le>maxlength)
                maxlength=le;
                
             }
             else
             sumlist.put(sum,i);
             
         }
         }
         return maxlength;
    }
}
