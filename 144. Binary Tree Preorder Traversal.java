class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        preorder(root,result);
        return result;
    }
    public List<Integer> preorder(TreeNode root,List<Integer> result){
        if(root==null) return result;
        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);
        return result;
    }
}
