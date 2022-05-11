link-https://leetcode.com/problems/middle-of-the-linked-list/submissions/

class Solution {
    public ListNode middleNode(ListNode head) {
        int c=1;
        ListNode n=head;
        while(n!=null)
        {
          n=n.next;
            c++;
        }
        if(c%2==0)
            c=c/2;
        else
            c=c/2+1;
         n=head;int t=0;
        while(n!=null)
        {
         
            t++;
            if(c==t)
                break;
             n=n.next;
        }
        return n;
    }
}
