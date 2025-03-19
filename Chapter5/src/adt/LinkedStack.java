/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author TARUC
 */
public class LinkedStack<T> implements StackInterface<T> {

    private Node topNode;

    public LinkedStack() {
        topNode = null;
    }

    @Override
    public void push(T newEntry) {
        Node newNode;
        if (topNode == null) {
            newNode = new Node(newEntry);
        } else {
            newNode = new Node(newEntry, topNode);
        }
        topNode = newNode;
    }

    @Override
    public T pop() {
        if (topNode == null) {
            return null;
        }

        T result = topNode.data;
        topNode = topNode.next;
        return result;
    }

    @Override
    public T peek() {
        if (topNode == null) {
            return null;
        }
        return topNode.data;
    }

    @Override
    public boolean isEmpty() {
        if (topNode == null) {
            return true;
            
        }
        return false;
    }

    @Override
    public void clear() {
        topNode = null;
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
