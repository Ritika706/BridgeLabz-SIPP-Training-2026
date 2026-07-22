package main.java.DSA.Scenerio_Based.Trees;


import java.util.*;

public class FamilyTree {

    TreeNode root;

    public FamilyTree(){

        root=new TreeNode(1);

        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
    }

    // Recursive Preorder
    public void preorder(TreeNode root){

        if(root==null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // Recursive Inorder
    public void inorder(TreeNode root){

        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // Recursive Postorder
    public void postorder(TreeNode root){

        if(root==null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    // Iterative Preorder
    public void iterativePreorder(){

        Stack<TreeNode> stack=new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()){

            TreeNode node=stack.pop();

            System.out.print(node.data+" ");

            if(node.right!=null)
                stack.push(node.right);

            if(node.left!=null)
                stack.push(node.left);
        }
    }

    // Iterative Inorder
    public void iterativeInorder(){

        Stack<TreeNode> stack=new Stack<>();

        TreeNode curr=root;

        while(curr!=null || !stack.isEmpty()){

            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }

            curr=stack.pop();

            System.out.print(curr.data+" ");

            curr=curr.right;
        }
    }

    // Iterative Postorder
    public void iterativePostorder(){

        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();

        s1.push(root);

        while(!s1.isEmpty()){

            TreeNode node=s1.pop();

            s2.push(node);

            if(node.left!=null)
                s1.push(node.left);

            if(node.right!=null)
                s1.push(node.right);
        }

        while(!s2.isEmpty())
            System.out.print(s2.pop().data+" ");
    }

    // Height
    public int height(TreeNode root){

        if(root==null)
            return 0;

        return 1+Math.max(height(root.left),height(root.right));
    }

    // Level Order
    public void levelOrder(){

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){

            TreeNode node=q.poll();

            System.out.print(node.data+" ");

            if(node.left!=null)
                q.offer(node.left);

            if(node.right!=null)
                q.offer(node.right);
        }
    }

    // Nodes at each level
    public void nodesPerLevel(){

        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);

        int level=0;

        while(!q.isEmpty()){

            int size=q.size();

            System.out.print("Level "+level+" : ");

            for(int i=0;i<size;i++){

                TreeNode node=q.poll();

                System.out.print(node.data+" ");

                if(node.left!=null)
                    q.offer(node.left);

                if(node.right!=null)
                    q.offer(node.right);
            }

            System.out.println();

            level++;
        }
    }

    // Diameter
    public int diameter(TreeNode root){

        if(root==null)
            return 0;

        int leftHeight=height(root.left);

        int rightHeight=height(root.right);

        int leftDiameter=diameter(root.left);

        int rightDiameter=diameter(root.right);

        return Math.max(leftHeight+rightHeight+1,
                Math.max(leftDiameter,rightDiameter));
    }

    // Balanced Tree
    public boolean isBalanced(TreeNode root){

        if(root==null)
            return true;

        int left=height(root.left);

        int right=height(root.right);

        if(Math.abs(left-right)>1)
            return false;

        return isBalanced(root.left)&&
                isBalanced(root.right);
    }

    public static void main(String[] args){

        FamilyTree tree=new FamilyTree();

        System.out.println("Recursive Preorder");
        tree.preorder(tree.root);

        System.out.println("\nRecursive Inorder");
        tree.inorder(tree.root);

        System.out.println("\nRecursive Postorder");
        tree.postorder(tree.root);

        System.out.println("\nIterative Preorder");
        tree.iterativePreorder();

        System.out.println("\nIterative Inorder");
        tree.iterativeInorder();

        System.out.println("\nIterative Postorder");
        tree.iterativePostorder();

        System.out.println("\nLevel Order");
        tree.levelOrder();

        System.out.println("\n\nNodes Per Level");
        tree.nodesPerLevel();

        System.out.println("\nHeight = "+tree.height(tree.root));

        System.out.println("Diameter = "+tree.diameter(tree.root));

        System.out.println("Balanced = "+tree.isBalanced(tree.root));
    }
}
