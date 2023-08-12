class Solution {
    public static int diameter(TreeNode root,int[] d){
        if(root==null) return 0;
        int lh=diameter(root.left,d);
        int rh=diameter(root.right,d);
        d[0]=Math.max(d[0],lh+rh);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] d={0};
        diameter(root,d);
        return d[0];
    }
}
