class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> mylist=new ArrayList<>();
        String str="";
        binaryTreePaths(root,mylist,str);
        return mylist;
    }
    public void binaryTreePaths(TreeNode root,List<String> mylist,String str){
        
        if(root==null){
            return;
        }
        if(!str.isEmpty()) str+="->";
        str+=root.val;
        if(root.left==null && root.right==null){
            mylist.add(str);
        }
        binaryTreePaths(root.left,mylist,str);
        binaryTreePaths(root.right,mylist,str);
    } 
}
