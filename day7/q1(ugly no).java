https://leetcode.com/problems/ugly-number-ii

class Solution {
    public int nthUglyNumber(int n) {
        
        if(n==1)
            return n;
        
        int p[]=new int[n+1];
        p[1]=1;
        int a=1,b=1,c=1;
        for(int i=2;i<=n;i++)
        {
            p[i]=Math.min(2*p[a],Math.min(3*p[b],5*p[c]));
            if(p[i]==2*p[a])
                a++;
            if(p[i]==3*p[b])
                b++;
            if(p[i]==5*p[c])
                c++;
        }
        return p[n];
    }
}
        
    
