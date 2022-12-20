package Tree.BinaryTree.BinaryTreeProblem;

import Tree.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class maxElementinBinaryTreeByLevelOrder {

    public static int getMax(BinaryTreeNode root){
        if(root==null)
            return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> que = new LinkedList<BinaryTreeNode>();
        que.offer(root);
        while(!que.isEmpty()){
            BinaryTreeNode tmp = que.poll();
            if(tmp.getData()>max)
                max = tmp.getData();
            if (tmp.getLeft() != null)
                que.offer(tmp.getLeft());
            if (tmp.getRight() != null)
                que.offer(tmp.getRight());

        }
        return max;
    }
}
