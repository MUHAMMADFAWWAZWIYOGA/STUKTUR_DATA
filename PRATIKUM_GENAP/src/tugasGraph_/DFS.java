package tugasGraph_;


import java.util.Stack;

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

public class DFS {

 public static void dfsTraversal(TreeNode root) {
     if (root == null) {
         return;
     }

     Stack<TreeNode> stack = new Stack<>();
     stack.push(root);

     System.out.print("DFS Traversal dari tree adalah: ");
     while (!stack.isEmpty()) {
         TreeNode node = stack.pop();
         System.out.print(node.val + " ");

         if (node.right != null) {
             stack.push(node.right);
         }

         if (node.left != null) {
             stack.push(node.left);
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

       dfsTraversal(root);
 }
}


