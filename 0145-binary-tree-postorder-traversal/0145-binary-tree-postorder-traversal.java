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


// class Solution {
//     ArrayList<Integer> postorder = new ArrayList<>();

//     public List<Integer> postorderTraversal(TreeNode root) {
//         postOrder(root);
//         return postorder;
//     }

//     public void postOrder(TreeNode root){
//         if(root == null){
//             return;
//         }
//         postOrder(root.left);
//         postOrder(root.right);
//         postorder.add(root.val);
//     }
// }


class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        ArrayList<Integer> postorder = new ArrayList<>();

        if(root==null){
            return postorder;
        }
        s1.push(root);
        while(!s1.isEmpty()){
            root = s1.pop();
            s2.push(root);
            if(root.left!=null) s1.push(root.left);
            if(root.right!=null) s1.push(root.right);
        }
        while(!s2.isEmpty()){
            postorder.add(s2.pop().val);
        }

        return postorder;
    }
}