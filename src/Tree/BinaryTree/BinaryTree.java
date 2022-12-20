package Tree.BinaryTree;

import java.net.Inet4Address;
import java.util.*;

public class BinaryTree {
    BinaryTreeNode root;

    public BinaryTree(){
        this.root = null;
    }


    //Insertion into the tree;
    public void insert(Integer data){

        root = insertNode(root,data);
    }

    public BinaryTreeNode insertNode(BinaryTreeNode root,int data){
        if(root==null){
            root = new BinaryTreeNode(data);
            return root;
        }
        else if(data<root.getData()){
            root.setLeft(insertNode(root.getLeft(),data));
        }
        else if(data>root.getData()){
            root.setRight(insertNode(root.getRight(),data));
        }
        return root;
    }

    //Recursion InOrder traversal
    public void recPreOrderTraversal(BinaryTreeNode root){
        if(root!=null){
            System.out.println(root.getData());
            recPreOrderTraversal(root.getLeft());
            recPreOrderTraversal(root.getRight());
        }
    }

    //Iterative PreOrder Traversal
    public List<Integer> itrPreOrderTraversal(BinaryTreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        if(root==null)
            return res;
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            BinaryTreeNode temp = stack.pop();
            res.add(temp.getData());
            if(temp.getRight()!=null)
                stack.push(temp.getRight());
            if(temp.getLeft()!=null)
                stack.push(temp.getLeft());
        }
        return res;
    }


    //InOrder by  recursion
    public void recInOrderTraversal(BinaryTreeNode root){
        if(root!=null){
            recInOrderTraversal(root.getLeft());
            System.out.println(root.getData());
            recInOrderTraversal(root.getRight());
        }
    }

    //Iterative InOrderTraversal
    public List<Integer> itrInOrderTraversal(BinaryTreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        BinaryTreeNode currentNode = root;
        boolean done = false;
        while(!done){
            if(currentNode!=null){
                s.push(currentNode);
                currentNode = currentNode.getLeft();
            }else{
                if(s.isEmpty()){
                    done = true;
                }
                else{
                    currentNode = s.pop();
                    res.add(currentNode.getData());
                    currentNode = currentNode.getRight();
                }
            }
        }
        return res;
    }

    //recursion PostOrderTraversal
    public void recPostOrderTraversal(BinaryTreeNode root){
        if(root!=null){
            recPostOrderTraversal(root.getLeft());
            recPostOrderTraversal(root.getRight());
            System.out.println(root.getData());
        }
    }

    //Iterative PostOrder traversal

    public List<Integer> itrPostOrderTraversal(BinaryTreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        if(root==null){
            return res;
        }
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);
        BinaryTreeNode prev = null;
        while(!s.isEmpty()){
            BinaryTreeNode cur = s.peek();
            if(prev==null || prev.getLeft() == cur || prev.getRight()==cur){
                if(cur.getLeft()!=null){
                    s.push(cur.getLeft());
                }
                else if(cur.getRight()!=null){
                    s.push(cur.getRight());
                }
            }
            else if(cur.getLeft()==prev) {
                if (cur.getRight() != null) {
                    s.push(cur.getRight());
                }
            }
            else{
                    res.add(cur.getData());
                    s.pop();
            }

            prev = cur;
        }
        return res;
    }

    //LevelOrder traversal
    public ArrayList<ArrayList<Integer>> levelOrderTraversal(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (root == null)
            return res;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        q.offer(null);
        ArrayList<Integer> cur = new ArrayList<Integer>();
        while (!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            if (tmp != null) {
                cur.add(tmp.getData());
                if (tmp.getLeft() != null)
                    q.offer(tmp.getLeft());
                if (tmp.getRight() != null)
                    q.offer(tmp.getRight());
            } else {
                ArrayList<Integer> c_curr = new ArrayList<Integer>(cur);
                res.add(c_curr);
                cur.clear();
                if (!q.isEmpty())
                    q.offer(null);
            }
        }
        return res;
    }

    //To do finding the height of the tree

    //Finding the size of the tree



}
