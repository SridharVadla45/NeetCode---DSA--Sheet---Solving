package src.linkedlist.removeallnodewithvaluek;
import src.linkedlist.mergetwosortedlists.Solution.ListNode;
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
      ListNode prev =null;
      ListNode curr = head;
      while (curr!=null){
          if(curr.val==val){
              prev.next=curr.next;
              curr.next =null;
              curr=prev.next;
          }
          prev=curr.next;
          curr=curr.next;
      }
      return head;
    }
}
