package _10_TREE;

public class D04_Four {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // *************Insert in BST */
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.right);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // *****************Search in BST */
    public static boolean Search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (root.data > key)
            return Search(root.left, key);
        else
            return Search(root.right, key);
    }

    // *****************Delete node in BST */
    public static Node delete(Node root, int val) {
        if (root.data < val)
            root.right = delete(root.right, val);
        else if (root.data > val)
            root.left = delete(root.left, val);
        else {
            if (root.left == null && root.right == null)
                return null;
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        delete(root, 5);
    }
}
