//BRUTEFORCE METHOD


class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ArrayList<Integer> list= new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        ListNode ans=null;
        for(int num : list){
            ListNode newNode=new ListNode(num);
            if(ans==null){
                ans=newNode;
                temp=ans;
            }
            temp.next=newNode;
            temp=temp.next;
        }
        return ans;
    }
}
