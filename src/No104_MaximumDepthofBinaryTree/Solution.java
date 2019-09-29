package No104_MaximumDepthofBinaryTree;

public class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = null;
        root.left.right = null;
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Input: " + root);
        System.out.println("Output: " + maxDepth(root));
    }

    // recursive
//    private static int maxDepth(TreeNode root) {
//        if(root == null)
//            return 0;
//        if(root.left == null && root.right == null){
//            return 1;
//        }
//        else if(root.left == null)
//            return 1 + maxDepth(root.right);
//        else if(root.right == null)
//            return 1 + maxDepth(root.left);
//        else
//            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//    }

    // iteration
    private static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

    }
}
