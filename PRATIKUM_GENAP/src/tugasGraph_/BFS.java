package tugasGraph_;

import java.util.LinkedList;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class BFS {

     public static void bfsTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        System.out.print("BFS Traversal dari tree adalah: ");
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println();
    }
   public static void printTree(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        printTree(root.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-------" + root.val);
        } else {
            System.out.println(root.val);
        }

        printTree(root.left, level + 1);
    }

    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

         System.out.println("Tree secara visual:");
        printTree(root, 0);

         bfsTraversal(root);
    }
}
