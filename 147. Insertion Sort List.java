class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        List<Integer> mylist=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            mylist.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(mylist);
        temp=head;int i=0;
        while(temp!=null){
            temp.val=mylist.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
    
}
