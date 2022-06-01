https://leetcode.com/problems/number-of-islands/


class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        if(grid.length==0)
            return 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    ismoreIsland(grid,i,j);
                        c++;
                }
            }
            
         }
            return c;
        }
    public void ismoreIsland(char grids[][],int i,int j)
    {
        if(i<0||j<0||i>=grids.length||j>=grids[0].length||grids[i][j]=='0'||grids[i][j]=='2')
            return;
           grids[i][j]='2';
            ismoreIsland(grids,i-1,j);
            ismoreIsland(grids,i+1,j);
            ismoreIsland(grids,i,j-1);
            ismoreIsland(grids,i,j+1);
            
    }
}
