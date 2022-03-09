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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p== null && q== null) return true;
        else if (p == null && q != null || p != null && q == null) return false;
        Stack <TreeNode> pS = new Stack<>();
        Stack <TreeNode> qS = new Stack<>();
        pS.push(p);
        qS.push(q);
        while(!pS.isEmpty() && !qS.isEmpty()) {
            TreeNode pTN = pS.pop();
            TreeNode qTN = qS.pop();
            if(pTN.val == -10001 && qTN.val == -10001) continue;
            if(pTN.val != qTN.val) return false;
            if(pTN.right != null) pS.push(pTN.right);
            else pS.push(new TreeNode(-10001));
            if(pTN.left != null) pS.push(pTN.left);
            else pS.push(new TreeNode(-10001));
            if(qTN.right != null) qS.push(qTN.right);
            else qS.push(new TreeNode(-10001)); 
            if(qTN.left != null) qS.push(qTN.left);
            else qS.push(new TreeNode(-10001));
        }
        return true;
    }
    
}
