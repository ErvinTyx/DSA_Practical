/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

import java.util.Iterator;

/**
 *
 * @author TARUC
 */
public class CircularLinkedQueue<T> implements QueueInterface<T>{
    private Node lastNode;
    
    public CircularLinkedQueue(){
        lastNode = null;
    }

    @Override
    public Iterator<T> getIterator() {
        
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry, null);
        
        if(isEmpty()){
            newNode.next = newNode;
        }else{
            newNode.next = lastNode.next;
            lastNode.next = newNode;
        }
        lastNode = newNode;
    }

    @Override
    public T dequeue() {
        T frontElement =null;
        if(!isEmpty()){
            frontElement = lastNode.next.next.data;
            lastNode = lastNode.next;
        }
        if (lastNode.next == lastNode){
            lastNode = null;
        }
        else {
            lastNode.next = lastNode.next.next;
        }
        return frontElement;
    }

    @Override
    public T getFront() {
        
    }

    @Override
    public boolean isEmpty() {
        
    }

    @Override
    public void clear() {
        
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
