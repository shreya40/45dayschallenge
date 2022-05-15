link-https://leetcode.com/problems/top-k-frequent-elements/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int cnt=0;
        for (int i:nums)
        {
            if (!hm.containsKey(i))
            {
                cnt++;
                hm.put(i,1);
            }
            else
            {
                int val=hm.get(i);
                val++;
                hm.put(i,val);
            }
        }
        //System.out.println(hm+" "+cnt);
        int [][]mat=new int [cnt][2];
        int i=0;
        for (int g:hm.keySet())
        {
            mat[i][0]=g;
            mat[i][1]=hm.get(g);
            i++;
        }
        Arrays.sort(mat,(a,b)->Integer.compare(a[1],b[1]));
        int []arr=new int [k];
        int index=mat.length-1;
        k--;
        while(k>=0)
        {
            arr[k]=mat[index][0];
            k--;
            index--;
        }
        return arr;
    }
}
