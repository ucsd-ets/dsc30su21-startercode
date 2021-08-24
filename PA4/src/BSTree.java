/*
 * Name: TODO
 * PID:  TODO
 */

import java.util.*;

/**
 * Binary search tree implementation.
 *
 * @author TODO
 * @since  TODO
 */
public class BSTree<T extends Comparable<? super T>> implements Iterable {

    /* * * * * BST Instance Variables * * * * */

    private int nelems; // number of elements stored
    private BSTNode root; // reference to root node

    /* * * * * BST Node Inner Class * * * * */

    protected class BSTNode {

        T key;
        BSTNode left;
        BSTNode right;

        /**
         * A constructor that initializes the BSTNode instance variables.
         *
         * @param left  Left child
         * @param right Right child
         * @param key   Node's key
         */
        public BSTNode(BSTNode left, BSTNode right, T key) {
            /* TODO */
        }

        /**
         * Return the key
         *
         * @return The key
         */
        public T getKey() {
            /* TODO */
            return null;
        }

        /**
         * Return the left child of the node
         *
         * @return The left child of the node
         */
        public BSTNode getLeft() {
            /* TODO */
            return null;
        }

        /**
         * Return the right child of the node
         *
         * @return The right child of the node
         */
        public BSTNode getRight() {
            /* TODO */
            return null;
        }


        /**
         * Setter for left child of the node
         *
         * @param newLeft New left child
         */
        public void setLeft(BSTNode newLeft) {
            /* TODO */
        }

        /**
         * Setter for right child of the node
         *
         * @param newRight New right child
         */
        public void setRight(BSTNode newRight) {
            /* TODO */
        }

    }

    /* * * * * BST Methods * * * * */

    /**
     * 0-arg constructor that initializes root to null and nelems to 0
     */
    public BSTree() {
        /* TODO */
    }

    /**
     * Return the root of BSTree. Returns null if the tree is empty
     *
     * @return The root of BSTree, null if the tree is empty
     */
    public BSTNode getRoot() {
        /* TODO */
        return null;
    }

    /**
     * Return the BST size
     *
     * @return The BST size
     */
    public int getSize() {
        /* TODO */
        return -1;
    }

    /**
     * Insert a key into BST
     *
     * @param key
     * @return true if insertion is successful and false otherwise
     */
    public boolean insert(T key) {
        /* TODO */
        return false;
    }

    /**
     * Return true if the tree contains the 'key', false
     * otherwise
     *
     * @param key To be searched
     * @return True if the 'key' is found, false otherwise
     * @throws NullPointerException If key is null
     */
    public boolean contains(T key) {
        /* TODO */
        return false;
    }

    /**
     * Remove the key from the BST
     *
     * @param key To be removed
     * @return True if the 'key' is removed, false otherwise
     * @throws NullPointerException If key is null
     */
    public boolean remove(T key){
        return false;
    }

    /**
     * Returns the smallest node from a given node
     *
     * @param root Smallest node will be found from this node
     * @return The smallest node from the 'root' node
     */
    private BSTNode findMin(BSTNode root) {
        return null;
    }

    /**
     * Print the BST nodes by preorder traversal
     *
     * @return string of keys in preorder, separated by a single space (“ ”).
     */
    public String printPreOrder(){
        return null;
    }

    /**
     * Print the BST nodes by postorder traversal
     *
     * @return string of keys in postorder, separated by a single space (“ ”).
     */
    public String printPostOrder(){
        return null;
    }

    /**
     * Print the BST nodes by inorder traversal
     *
     * @return string of keys in inorder, separated by a single space (“ ”).
     */
    public String printInOrder(){
        return null;
    }

    /**
     * Return the height of the tree
     *
     * @return The height of the tree, -1 if BST is empty
     */
    public int findHeight() {
        /* TODO */
        return -1;
    }

    /**
     * Helper for the findHeight method
     *
     * @param root Root node
     * @return The height of the tree, -1 if BST is empty
     */
    private int findHeightHelper(BSTNode root) {
        /* TODO */
        return -1;
    }

    /* * * * * BST Iterator * * * * */

    public class BSTree_Iterator implements Iterator<T> {
        public BSTree_Iterator() {
            /* TODO */
        }

        public boolean hasNext() {
            /* TODO */
            return false;
        }

        public T next() {
            /* TODO */
            return null;
        }
    }

    public Iterator<T> iterator() {
        /* TODO */
        return null;
    }
}

