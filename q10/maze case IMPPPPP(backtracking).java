https://practice.geeksforgeeks.org/problems/rat-maze-with-multiple-jumps3852/1#




class Solution
{
    public boolean maze(int i,int j,int matrix[][],int ans[][])
    {
        if(i==matrix.length-1&&j==matrix.length-1)
        {
            ans[i][j]=1;
            return true;
        }
        if(i<matrix.length&&j<matrix.length&&matrix[i][j]!=0)
        {
            for(int k=1;k<=matrix[i][j];k++)
            {
                if(maze(i,j+k,matrix,ans)||maze(i+k,j,matrix,ans))
                {
                ans[i][j]=1;
                return true;
                }
                
            }
            return false;
        }
        return false;
    }
    public int[][] ShortestDistance(int[][] matrix)
    {
       int ans[][] =new int[matrix.length][matrix.length];
       if(maze(0,0,matrix,ans))
       return ans;
       return new int[][]{{-1}};
    }
    
    
}
