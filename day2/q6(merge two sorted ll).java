link-https://leetcode.com/problems/merge-two-sorted-lists/


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
       ListNode ll=null;
        ListNode ll1=list1;
         ListNode ll2=list2;
        while(ll1.next!=null&&ll2.next!=null)
        {
            if(ll1.val>ll2.val)
            {
                ll.val=ll2.val;
                ll2=ll2.next;
            }
            else if(ll1.val<ll2.val)
            {
               ll.val=ll1.val;
                ll2=ll1.next; 
            }
               else
               {
                    ll.val=ll2.val;
                ll2=ll2.next;
                    ll.val=ll1.val;
                ll2=ll1.next; 
               }
        }
        return ll;
    }
}
