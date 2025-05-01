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
    public static void getInorder(Node root,ArrayList<Integer> ans){
        if(root == null)
            return;
            getInorder(root.left, ans);
            ans.add(root.data);
            getInorder(root.right, ans);
        }
        public static Node createBST(ArrayList<Integer> ans,int st,int end){
        if(st>end)
            return null;
        int mid = (st+end)/2;
        Node root = new Node(ans.get(mid));
    public static void main(String[] args) {
        
    }
}
