//https://practice.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Flatten {
    public static void main(String[] args) {

    }

    public static void flatten(Node root)
    {
        //code here
        if (root==null){
            return;
        }
        LinkedList<Node> list=new LinkedList<>();
//        list.add(root.key );
//        flatten(root.left);
        System.out.println(list);
    }
}
