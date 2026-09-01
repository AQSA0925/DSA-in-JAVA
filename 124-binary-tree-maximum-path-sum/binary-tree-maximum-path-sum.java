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
    private int sum(TreeNode root, int[]ans){
        if(root == null) return 0;
        int leftsum = Math.max(0,sum(root.left,ans));
        int rightsum = Math.max(0,sum(root.right,ans));
        int totalsum = root.val + leftsum + rightsum ;
        ans[0] = Math.max(ans[0] , totalsum);

        return root.val + Math.max(leftsum , rightsum);
        }
    
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        int []ans = {Integer.MIN_VALUE};
        sum(root,ans);
        return ans[0];
    }
}