package _10_TREE;

import java.util.*;

public class D01_First {
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
        static class BinaryTree{
            static int idx = -1;

            public static Node buildTree(int nodes[]){
                idx++;
                if(nodes[idx] == -1){
                    return null;
                }
            }
        }
    public static void main(String[] args) {

    }
}
