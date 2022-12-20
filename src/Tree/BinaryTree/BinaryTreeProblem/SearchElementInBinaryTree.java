package Tree.BinaryTree.BinaryTreeProblem;

import Tree.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SearchElementInBinaryTree {

    public static boolean searchElementByRec(BinaryTreeNode root,int data){

        if(root==null)
            return false;
        else if(root.getData()==data)
            return true;
        else if(data<root.getData())
            return searchElementByRec(root.getLeft(),data);
        else
            return searchElementByRec(root.getRight(),data);
    }

    //Without Recursion
    public static boolean searchElementWithoutRec(BinaryTreeNode root,int data){
        if(root==null)
            return false;
        boolean flag = false;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            BinaryTreeNode tmp = q.poll();
            if(tmp==null)
                flag = false;
            else if(tmp.getData()==data){
                flag = true;
                q.clear();
                break;
            }
            else if(data<tmp.getData()){
                if(tmp.getLeft()!=null)
                    q.offer(tmp.getLeft());
            }
            else if(data>tmp.getData()){
                if(tmp.getRight()!=null)
                    q.offer(tmp.getRight());
            }

        }
        return flag;
    }

}
