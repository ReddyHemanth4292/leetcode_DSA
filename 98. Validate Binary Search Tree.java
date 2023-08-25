class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> mylist=new ArrayList<>();
        inorder(root,mylist);
        boolean cnt=true;
        for(int i=0;i<mylist.size()-1;i++){
            if(mylist.get(i)>=mylist.get(i+1)){
                cnt=false;
                break;
            }
        }
        //for(int i=0;i<mylist.size();i++) System.out.println(mylist.get(i)+" ");
        return cnt==true;
    }
    public void inorder(TreeNode root,List<Integer>mylist){
        if(root==null) return;
        inorder(root.left,mylist);
        mylist.add(root.val);
        inorder(root.right,mylist);
    }
}
