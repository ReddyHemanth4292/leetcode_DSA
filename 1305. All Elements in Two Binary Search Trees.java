class Solution {
    public static TreeNode inorder(TreeNode root,List<Integer> mylist){
        if(root==null) return root;
        inorder(root.left,mylist);
        mylist.add(root.val);
        inorder(root.right,mylist);
        return root;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> mylist=new ArrayList<>();
        inorder(root1,mylist);
        inorder(root2,mylist);
        Collections.sort(mylist);
        return mylist;
    }
}
