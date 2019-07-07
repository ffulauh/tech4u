package me.ffulauh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Tree91 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        root.right=node2;
        node2.left=new TreeNode(3);
        System.out.println(inorderTraversal(root));

    }


    static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        traversal(root,result);
        return result;
    }

    static void traversal(TreeNode t,List<Integer> elements){
        if(t!=null){
            traversal(t.left,elements);
            elements.add(t.val);
            traversal(t.right,elements);
        }
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            this.val=x;
        }
    }
}


