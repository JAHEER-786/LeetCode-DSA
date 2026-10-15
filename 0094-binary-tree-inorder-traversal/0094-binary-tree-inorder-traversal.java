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
//     ArrayList<Integer> list = new ArrayList<>();

//     public List<Integer> inorderTraversal(TreeNode root) {
//        traverse(root);
//        return list;
//     }

//     public void traverse(TreeNode root){
//         if(root==null){
//             return ;
//         }
//         traverse(root.left);
//         list.add(root.val);
//         traverse(root.right);
//     }
// }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(true){
            if(root != null){
                stack.push(root);
                root = root.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }else{
                    root = stack.pop();
                    inOrder.add(root.val);
                    root = root.right;
                }
            }
        }

        return inOrder;
    }
}