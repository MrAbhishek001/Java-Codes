public class BST_Search {
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

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean Search(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        } else if (root.data < target) {
            return Search(root.right, target);
        } else {
            return Search(root.left, target);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        inOrder(root);
        System.out.println(Search(root, 56));
    }
}
