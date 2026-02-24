package datastructures.treesandgraphs;

public class ValidateBST {
    static boolean isValidBST(TreeNode root, Integer min, Integer max){
        if (root == null) return true;

        if ((min != null && root.value <= min) || (max != null && root.value >= max)) return false;

        return isValidBST(root.left, min, root.value) && isValidBST(root.right, root.value, max);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        System.out.println("Is Valid Binary Search Tree: " + isValidBST(root, null, null));
    }
}
