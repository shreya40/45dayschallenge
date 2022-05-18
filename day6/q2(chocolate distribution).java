https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1/#

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
    Collections.sort(a);
       long mindiff = Integer.MAX_VALUE;
       for(int i = 0;i<n-m+1;i++){
           mindiff = Math.min(a.get(i+m-1)-a.get(i),mindiff);
       }
       return mindiff;
    }
}
