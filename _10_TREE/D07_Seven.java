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
         root.left = createBST(ans, st, mid-1);
        root.right = createBST(ans, mid+1,end);
        return root;
    }
    public static Node balancedBST(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        getInorder(root, ans);
        root = createBST(ans, 0, ans.size()-1);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3); 
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = balancedBST(root);
        preorder(root);
    }
}
