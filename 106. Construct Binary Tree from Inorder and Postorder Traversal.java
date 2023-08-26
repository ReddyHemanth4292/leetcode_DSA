class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> mymap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mymap.put(inorder[i],i);
        }
        TreeNode root=buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mymap);
        return root;
    }
    
    public TreeNode buildTree(int[] inorder,int is,int ie,int[] postorder,int ps,int pe,Map<Integer,Integer> mymap){
        if(is>ie || ps>pe) return null;
        TreeNode root=new TreeNode(postorder[pe]);
        int inroot=mymap.get(postorder[pe]);
        int lsl=inroot-is;
        root.left=buildTree(inorder,is,inroot-1,postorder,ps,ps+lsl-1,mymap);
        root.right=buildTree(inorder,inroot+1,ie,postorder,ps+lsl,pe-1,mymap);
        return root;

    }
}
