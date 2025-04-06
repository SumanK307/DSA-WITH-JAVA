package _10_TREE;

public class D03_Third {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        int dia;
        int ht;
        public Info(int dia,int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    // is this subtree
    public static boolean isSubtree(Node root,Node subRoot){
        if(root == null)
            return false;   
 
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot))
                return true;
        }
        boolean leftAns = isSubtree(root.left, subRoot);
        boolean rightAns = isSubtree(root.right, subRoot);
        return leftAns || rightAns;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }
}
