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
    int maxLevel = 0;
    final List<Integer> list = new ArrayList();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return list;
        rightView(root,1);
        return list;
    }
    private void rightView(TreeNode root,int level){
        if(root == null) return;
        if(maxLevel < level){
            list.add(root.val);
            maxLevel = level;
        }
        rightView(root.right,level+1);
        rightView(root.left,level+1);
    }
}