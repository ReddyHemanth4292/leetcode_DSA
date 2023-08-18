//recursive approach
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return Math.max(lh,rh)+1;
    }
}

//level wise traversal approach
class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root); int level=0;
        if(root==null) return 0;
        while(!queue.isEmpty()){
            int noinqueue=queue.size();
            level+=1;
            for(int i=0;i<noinqueue;i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                queue.remove();
            }
        }
        return level;
    }
}
