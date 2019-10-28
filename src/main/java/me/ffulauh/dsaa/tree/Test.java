package me.ffulauh.dsaa.tree;

import me.ffulauh.dsaa.tree.book.BinarySearchTree;

public class Test {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst=new BinarySearchTree<>();
        Integer[] nums=new Integer[]{6,2,8,1,5,3,4};
        for(Integer num:nums){
            bst.insert(num);
        }
        bst.printTree();
        bst.remove(2);
        System.out.println("----");
        bst.printTree();
    }
}
