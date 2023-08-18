class Solution {
    public int isBalancedTree(TreeNode root){
        if(root==null) return 0;
        int lh=isBalancedTree(root.left);
        if(lh==-1) return -1;
        int rh=isBalancedTree(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return isBalancedTree(root)!=-1;
    }
}
