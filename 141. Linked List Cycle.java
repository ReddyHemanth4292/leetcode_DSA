public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastptr=head;
        ListNode slowptr=head;
        ListNode current=head;
        if(current==null || current.next==null){
            return false;
        }
        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(fastptr==slowptr){
                return true;
            }
            

        }
        return false;
    }
}
