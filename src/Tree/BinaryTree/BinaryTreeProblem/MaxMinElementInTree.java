package Tree.BinaryTree.BinaryTreeProblem;


import Tree.BinaryTree.BinaryTreeNode;

public class MaxMinElementInTree {

    public static Integer getMax(BinaryTreeNode root){
        int maxVal = Integer.MIN_VALUE;
        if(root!=null){
            Integer lmax = getMax(root.getLeft());
            Integer Rmax = getMax(root.getRight());

            if(lmax>Rmax)
                maxVal = lmax;
            else
                maxVal = Rmax;
            if(root.getData()>maxVal)
                maxVal = root.getData();
        }
        return maxVal;
    }

    public static Integer getMin(BinaryTreeNode root){
        Integer minVal = Integer.MAX_VALUE;
        if(root!=null){
            int lMin = getMin(root.getLeft());
            int rMin = getMin(root.getRight());
            if(lMin<rMin)
                minVal = lMin;
            else
                minVal = rMin;
            if(root.getData()<minVal)
                minVal = root.getData();
        }
        return minVal;
    }
}
