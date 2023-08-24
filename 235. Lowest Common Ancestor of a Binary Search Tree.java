class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p ||root==q) return root;
        TreeNode lh=lowestCommonAncestor(root.left,p,q);
        TreeNode rh=lowestCommonAncestor(root.right,p,q);
        
        if(lh==null) return rh;
        else if(rh==null) return lh;
        return root;
    }
}
