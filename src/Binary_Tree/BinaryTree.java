package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    Node root;

//    BinaryTree(){
//        root = null;
//    }
//
//    BinaryTree(int key){
//        root = new Node(key);
//    }

    private Node addRecursive(Node current,int value){
        if(current == null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = addRecursive(current.left,value);
        }
        else if(value > current.value){
            current.right = addRecursive(current.right,value);
        }
        else{
            //value already exists
            return current;
        }
        return  current;
    }

    public void add(int value){
        root = addRecursive(root,value);
    }

    private boolean searchRecursive(Node current,int value){
        if(current == null){
            return false;
        }
        if (value == current.value){
            return true;
        }
        return value < current.value ? searchRecursive(current.left,value) : searchRecursive(current.right,value);
    }

    public boolean search(int value){
        return searchRecursive(root,value);
    }

    public Node deleteRecursive(Node current, int value){
        if(current == null){
            return null;
        }
        if (value == current.value){
            if(current.left == null && current.right==null){
                return null;
            }
            if(current.right == null){
                return current.left;
            }
            if(current.left == null){
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if(value < current.value){
            current.left = deleteRecursive(current.left,value);
            return current;
        }
        current.right = deleteRecursive(current.right,value);
        return current;
    }

    //to find the node that will replace the node to be deleted
    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public void delete(int value){
        root = deleteRecursive(root,value);
    }

    //depth first search
    public void traverseInOrder(Node node){
        if (node != null){
            traverseInOrder(node.left);
            System.out.println(" "+node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    //breadth first search
    public void traverseInLevel(){
        if (root ==null){
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            Node node = nodes.remove();
            System.out.println(" "+node.value);
            if(node.left != null){
                nodes.add(node.left);
            }
            if(node.right != null){
                nodes.add(node.right);
            }
        }
    }

    public void input(){
        System.out.println("Enter the number of elements to add in the tree");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            add(sc.nextInt());
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.input();
        bt.traverseInLevel();

    }
}
