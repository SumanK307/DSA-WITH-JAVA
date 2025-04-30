package _10_TREE;
import java.util.ArrayList;

public class D07_Seven {

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
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        
    }
}
