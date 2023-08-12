class Solution {
    public void traversal(TreeNode root, List<Integer> result){
        if(root==null) return ;
        traversal(root.left,result);
        traversal(root.right,result);
        result.add(root.val);
    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> result=new ArrayList<>();
        traversal(root, result);
        return result;

    }
}
