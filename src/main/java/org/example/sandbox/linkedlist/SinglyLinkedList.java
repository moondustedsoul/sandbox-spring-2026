package org.example.sandbox.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {

        Node newNode = new Node(element, head); // 1, 2

        // 3
        if (head == null) { // empty list
            head = newNode;
            tail = newNode;
        } else {
            head = newNode;
        }

    }

    @Override
    public void addLast(E element) {

        Node newNode = new Node(element, null); // 1

        if (tail == null) { // empty list
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode; // 2
            tail = newNode; // 3
        }

    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");

        Node current = head;
        if (current != null) {

            while (current != null) {
                joiner.add(current.element.toString());
                current = current.next;
            }
        }
        builder.append(joiner);
        builder.append("]");
        return builder.toString();

    }

    private class Node {

        E element;
        Node next;


        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
