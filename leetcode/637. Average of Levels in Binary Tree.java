/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        Queue<TreeNode> bfsQueue=new LinkedList<>();
        bfsQueue.add(root);
        while(!bfsQueue.isEmpty()){
            int size=bfsQueue.size();
            int currenlevelItemCount = bfsQueue.size();
            double currentLevelTotal = 0;
            for (int i = size - 1; i >= 0; i -= 1){
                TreeNode headOfQueue = bfsQueue.poll();
                currentLevelTotal = currentLevelTotal + headOfQueue.val;
                if(headOfQueue.left!=null){
                    bfsQueue.add(headOfQueue.left);
                }
                if(headOfQueue.right!=null){
                    bfsQueue.add(headOfQueue.right);
                }
            }
            currentLevelTotal = (currentLevelTotal/currenlevelItemCount);
            result.add(currentLevelTotal);
        }
        return result;
    }
}
