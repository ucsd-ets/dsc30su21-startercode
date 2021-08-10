/*
 * NAME: TODO First Last
 * PID: TODO Axxxxxxxx
 */

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Doubly-Linked List Implementation
 *
 * @author TODO
 * @since TODO
 */

    public class DoublyLinkedList {

    private int nelems;
    private Node head;
    private Node tail;

    /**
     * Node for chaining together to create a linked list
     */
    protected class Node {
        int data;
        Node next;
        Node prev;

        /**
         * Constructor to create singleton Node
         */
        private Node(int element) {
            // TODO: complete constructor
        }

        /**
         * Constructor to create singleton link it between previous and next
         *
         * @param element  Element to add, can be null
         * @param nextNode successor Node, can be null
         * @param prevNode predecessor Node, can be null
         */
        private Node(int element, Node nextNode, Node prevNode) {
            // TODO: complete implementation
        }

        /**
         * Set the previous node in the list
         *
         * @param p new previous node
         */
        public void setPrev(Node p) {
            // TODO: complete implementation
        }

        /**
         * Set the next node in the list
         *
         * @param n new next node
         */
        public void setNext(Node n) {
            // TODO: complete implementation
        }

        /**
         * Set the element
         *
         * @param e new element
         */
        public void setElement(int e) {
            // TODO: complete implementation
        }

        /**
         * Accessor to get the next Node in the list
         */
        public Node getNext() {
            return null; // TODO: complete implementation
        }

        /**
         * Accessor to get the prev Node in the list
         */
        public Node getPrev() {
            return null; // TODO: complete implementation
        }

        /**
         * Accessor to get the Nodes Element
         */
        public int getElement() {
            return 0; // TODO: complete implementation
        }

        /**
         * Remove this node from the list. Update previous and next nodes
         */
        public void remove() {
            // TODO: complete implementation
        }
    }

    /**
     * Creates a new, empty doubly-linked list.
     */
    public DoublyLinkedList() {
        // TODO: complete default constructor
    }

    /**
     * Retrieves the amount of elements that are currently on the list.
     *
     * @return Number of elements currently on the list
     */
    public int size() {
        // TODO: complete implementation
        return 0;
    }

    /**
     * Retrieves the element stored with a given index on the list.
     *
     * @param index The index of the desired element.
     * @return The element stored in the Node with the desired index.
     * @throws IndexOutOfBoundsException if index received is out of bounds for
     *                                   the current list.
     */
    public int get(int index) throws IndexOutOfBoundsException {
        // TODO: Fill in implementation to get the node at index
        return 0;
    }

    /**
     * Add an element to the end of the list
     *
     * @param data data to be added
     */
    public boolean add(int data) {
        // TODO: complete implementation
        return true;
    }

    /**
     * Adds an element to a certain index in the list, shifting exist elements
     * create room.
     *
     * @param index Where in the list to add the element.
     * @param data  Data to be added.
     * @throws IndexOutOfBoundsException if index received is out of bounds for
     *                                   the current list.
     */
    public void add(int index, int data)
            throws IndexOutOfBoundsException {
        // TODO: complete implementation
    }

    /**
     * Sets the value of an element at a certain index in the list.
     *
     * @param index Where in the list the data should be added.
     * @param data  Data to add.
     * @return Element that was previously at this index.
     * @throws IndexOutOfBoundsException if index received is out of bounds for
     *                                   the current list.
     */
    public int set(int index, int data)
            throws IndexOutOfBoundsException {
        // TODO: Fill in implementation
        return 0;
    }

    /**
     * remove the element from position index in the list
     * @param index:index where in the list the data should be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if index<0 || index >= size
     */
    public int remove(int index) throws IndexOutOfBoundsException {
        // TODO: Fill in implementation
        return 0;
    }

    /**
     * Clear the linked list
     */
    public void clear() {
        // TODO: implement clear
    }

    /**
     * Determine if the list empty
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        // TODO: implement isEmpty
        return true;
    }

    // Helper method to get the Node at the Nth index
    private Node getNth(int index) {
        // TODO: implement
        return null;
    }

    /**
     * Determine if this list contains the given data
     * @param data data to find
     * @return true if list contains given data, false otherwise
     */
    public boolean contains(Object data) {
        // TODO: Fill in implementation
        return false;
    }

    /**
     * String representation of this list in the form of:
     * "[(head) -> elem1 -> elem2 -> ... -> elemN -> (tail)]"
     * @return string representation
     */
    @Override
    public String toString() {
        return null;
    }
}