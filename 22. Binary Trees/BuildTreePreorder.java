import java.util.LinkedList;
import java.util.Queue;

public class BuildTreePreorder {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node BuildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }

        public void PreOrderTraversal(Node root) {
            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            PreOrderTraversal(root.left);
            PreOrderTraversal(root.right);
            return;
        }

        public void InOrderTraversal(Node root) {
            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }
            InOrderTraversal(root.left);
            System.out.print(root.data + " ");
            InOrderTraversal(root.right);
            return;
        }

        public void PostOrderTraversal(Node root) {
            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }

            PostOrderTraversal(root.left);
            PostOrderTraversal(root.right);
            System.out.print(root.data + " ");
            return;
        }

        public void LevelOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node CurrNode = q.remove();
                if (CurrNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(CurrNode.data + " ");
                    if (CurrNode.left != null) {
                        q.add(CurrNode.left);
                    }
                    if (CurrNode.right != null) {
                        q.add(CurrNode.right);
                    }
                }

            }
        }

        public int Height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = Height(root.left);
            int rh = Height(root.right);
            int height = Math.max(lh, rh) + 1;
            return height;
        }

        public int NodesCount(Node root) {
            if (root == null) {
                return 0;
            }
            int lCount = NodesCount(root.left);
            int rCount = NodesCount(root.right);
            return lCount + rCount + 1;
        }

        public int NodesSum(Node root) {
            if (root == null) {
                return 0;
            }
            int lSum = NodesSum(root.left);
            int rSum = NodesSum(root.right);
            return lSum + rSum + root.data;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println("Root Of Binary tree : " + root.data);
        System.out.print("PreOrder Binary Tree : ");
        tree.PreOrderTraversal(root);
        System.out.println();
        System.out.print("InOrder Binary Tree : ");
        tree.InOrderTraversal(root);
        System.out.println();
        System.out.print("PostOrder Binary Tree : ");
        tree.PostOrderTraversal(root);
        System.out.println();
        System.out.println("LevelOrder Binary Tree : ");
        tree.LevelOrderTraversal(root);
        System.out.println("Height of the Binary tree is : " + tree.Height(root));
        System.out.println("No of Nodes in Binary tree : " + tree.NodesCount(root));
        System.out.println("Sum of Nodes in Binary tree : " + tree.NodesSum(root));
    }
}