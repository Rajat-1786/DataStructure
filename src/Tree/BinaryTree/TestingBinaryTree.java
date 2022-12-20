package Tree.BinaryTree;

import Tree.BinaryTree.BinaryTreeProblem.MaxMinElementInTree;
import Tree.BinaryTree.BinaryTreeProblem.SearchElementInBinaryTree;
import Tree.BinaryTree.BinaryTreeProblem.maxElementinBinaryTreeByLevelOrder;

import java.util.ArrayList;

public class TestingBinaryTree {

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(1);
        tree.insert(2);
        tree.insert(6);
        tree.insert(7);
        ArrayList<ArrayList<Integer>> list = tree.levelOrderTraversal(tree.root);
        System.out.println(list);
        //preOrderTesting
//        tree.recPreOrderTraversal(tree.root);
//        System.out.println(tree.itrPreOrderTraversal(tree.root));

        //InOrder Testing
//        tree.recInOrderTraversal(tree.root);
//        System.out.println(tree.itrInOrderTraversal(tree.root));

        //postOrder testing
//        tree.recPostOrderTraversal(tree.root);
//        System.out.println(tree.itrPostOrderTraversal(tree.root));
//        Integer maxVal = MaxMinElementInTree.getMax(tree.root);
//        System.out.println(maxVal);
//        System.out.println(MaxMinElementInTree.getMin(tree.root));

        //Max ELement get Testing

        System.out.println(maxElementinBinaryTreeByLevelOrder.getMax(tree.root));
        System.out.println(SearchElementInBinaryTree.searchElementByRec(tree.root,3));
        System.out.println(SearchElementInBinaryTree.searchElementWithoutRec(tree.root,4));
    }
}
