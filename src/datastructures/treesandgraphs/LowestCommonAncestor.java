package datastructures.treesandgraphs;

public class LowestCommonAncestor {

    static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);

        if (left != null && right != null)
            return root;

        return left != null ? left : right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(5);
        root.right.right = new TreeNode(6);


        TreeNode result = lca(root, root.left, root.right);
        System.out.println("LCA: " + result.value);
    }
}