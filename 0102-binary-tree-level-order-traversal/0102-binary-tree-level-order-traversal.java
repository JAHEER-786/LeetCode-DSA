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
    List<List<Integer>> levelorder = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return levelorder;
        }
        level_Order(root);
        return levelorder;
    }

    public void level_Order(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr != null){
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }else{
                levelorder.add(list);
                list = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
        }
    } 
}