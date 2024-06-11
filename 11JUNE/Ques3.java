import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Ques3 {
    public void inorder(List<Integer> result, TreeNode root) {
        if (root == null) return;
        inorder(result, root.left);
        result.add(root.val);
        inorder(result, root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(result, root);
        return result;
    }

    public static void main(String[] args) {
        // Create a sample binary tree for testing
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Create an instance of Ques3 class
        Ques3 solution = new Ques3();

        // Perform inorder traversal
        List<Integer> inorderResult = solution.inorderTraversal(root);

        // Print the result
        System.out.println("Inorder Traversal: " + inorderResult);
    }
}
