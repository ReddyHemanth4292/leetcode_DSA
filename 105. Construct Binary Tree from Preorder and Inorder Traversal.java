class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mymap=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            mymap.put(inorder[i],i);
        }
        TreeNode root=buildTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1,mymap);
        return root;
    }
    public TreeNode buildTree(int[] inorder,int is,int ie,int[] preorder,int ps,int pe,Map<Integer,Integer> mymap){
        if(ps>pe ||is>ie) return null;
        TreeNode root=new TreeNode(preorder[ps]);
        int inroot=mymap.get(root.val);
        int lsl=inroot-is;
        root.left=buildTree(inorder, is,inroot-1,preorder,ps+1,ps+lsl,mymap);
        root.right=buildTree(inorder,inroot+1,ie,preorder,ps+lsl+1,pe,mymap);
        return root;
    }
}
