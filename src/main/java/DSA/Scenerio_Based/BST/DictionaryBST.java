package main.java.DSA.Scenerio_Based.BST;


import java.util.*;

public class DictionaryBST {

    BSTNode root;
    int count = 0;

    // Insert
    public BSTNode insert(BSTNode root, String word) {

        if (root == null)
            return new BSTNode(word);

        if (word.compareTo(root.word) < 0)
            root.left = insert(root.left, word);

        else if (word.compareTo(root.word) > 0)
            root.right = insert(root.right, word);

        return root;
    }

    // Search
    public boolean search(BSTNode root, String word) {

        if (root == null)
            return false;

        if (root.word.equals(word))
            return true;

        if (word.compareTo(root.word) < 0)
            return search(root.left, word);

        return search(root.right, word);
    }

    // Delete
    public BSTNode delete(BSTNode root, String word) {

        if (root == null)
            return null;

        if (word.compareTo(root.word) < 0)
            root.left = delete(root.left, word);

        else if (word.compareTo(root.word) > 0)
            root.right = delete(root.right, word);

        else {

            // Leaf Node
            if (root.left == null && root.right == null)
                return null;

            // One Child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Two Children
            BSTNode successor = findMin(root.right);

            root.word = successor.word;

            root.right = delete(root.right, successor.word);
        }

        return root;
    }

    // Minimum Node
    public BSTNode findMin(BSTNode root) {

        while (root.left != null)
            root = root.left;

        return root;
    }

    // Inorder Traversal
    public void inorder(BSTNode root) {

        if (root == null)
            return;

        inorder(root.left);

        System.out.print(root.word + " ");

        inorder(root.right);
    }

    // kth Smallest
    public String kthSmallest(BSTNode root, int k) {

        if (root == null)
            return null;

        String left = kthSmallest(root.left, k);

        if (left != null)
            return left;

        count++;

        if (count == k)
            return root.word;

        return kthSmallest(root.right, k);
    }

    // Validate BST
    public boolean isBST(BSTNode root, String min, String max) {

        if (root == null)
            return true;

        if (min != null && root.word.compareTo(min) <= 0)
            return false;

        if (max != null && root.word.compareTo(max) >= 0)
            return false;

        return isBST(root.left, min, root.word)
                && isBST(root.right, root.word, max);
    }

    // Lowest Common Ancestor
    public BSTNode LCA(BSTNode root, String w1, String w2) {

        if (root == null)
            return null;

        if (w1.compareTo(root.word) < 0 &&
                w2.compareTo(root.word) < 0)
            return LCA(root.left, w1, w2);

        if (w1.compareTo(root.word) > 0 &&
                w2.compareTo(root.word) > 0)
            return LCA(root.right, w1, w2);

        return root;
    }

    public static void main(String[] args) {

        DictionaryBST tree = new DictionaryBST();

        String words[] = {
                "Mango","Apple","Banana","Orange","Grapes",
                "Cherry","Peach","Lemon","Kiwi","Guava",
                "Papaya","Berry","Coconut","Pear","Plum",
                "Fig","Avocado","Date","Melon","Pineapple"
        };

        for (String word : words)
            tree.root = tree.insert(tree.root, word);

        System.out.println("Inorder Traversal");

        tree.inorder(tree.root);

        System.out.println("\n");

        System.out.println("Search Mango : "
                + tree.search(tree.root, "Mango"));

        System.out.println("Search Car : "
                + tree.search(tree.root, "Car"));

        tree.root = tree.delete(tree.root, "Orange");

        System.out.println("\nAfter Deleting Orange");

        tree.inorder(tree.root);

        tree.count = 0;

        System.out.println("\n\n5th Smallest = "
                + tree.kthSmallest(tree.root, 5));

        System.out.println("Valid BST = "
                + tree.isBST(tree.root, null, null));

        BSTNode lca =
                tree.LCA(tree.root, "Apple", "Kiwi");

        System.out.println("LCA = " + lca.word);

    }
}
