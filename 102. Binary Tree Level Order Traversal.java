import java.util.Queue;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> finalAns=new ArrayList<List<Integer>>();
        if(root==null) return finalAns;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levels=queue.size();

            List<Integer> sublevel=new ArrayList<>();
            for(int i=0;i<levels;i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                sublevel.add(queue.remove().val);
            }
            finalAns.add(sublevel);
        }
        return finalAns;
    }
}
