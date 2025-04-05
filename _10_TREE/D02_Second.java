package _10_TREE;

public class D02_Second{
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
     // Height of tree
     public static int height(Node root){
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }

    //Count of node in tree
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCnt = count(root.left);
        int rightCnt = count(root.right);
        return leftCnt+rightCnt+1;
    }

    //sum of node data 
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int leftHt = height(root.left);
        int rightDia = diameter(root.right);
        int rightHt = height(root.right);

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(diameter(root));
    }
}
