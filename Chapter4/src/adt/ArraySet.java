/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

import java.util.Iterator;

/**
 *
 * @author TARUMT
 */
public class ArraySet<T> implements SetInterface<T> {

    T[] setArray;
    int numberOfElements;
    private static final int DEFAULT_CAPACIY = 25;

    public ArraySet() {
        this(DEFAULT_CAPACIY);
    }

    public ArraySet(int initialCapacity) {
        numberOfElements = 0;
        setArray = (T[]) new Object[initialCapacity];
    }

    @Override
    public boolean add(T newElement) {
        for (int i = 0; i < numberOfElements; i++) {
            if (setArray[i].equals(newElement)) {
                return false;
            }
        }
        if (isArrayFull()) {
            doubleArray();
        }
        setArray[numberOfElements] = newElement;
        numberOfElements++;
        return true;
    }

    @Override
    public boolean remove(T anElement) {
        for (int i = 0; i < numberOfElements; i++) {
            if (setArray[i].equals(anElement)) {
                removeGap(i);
                numberOfElements--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkSubset(SetInterface anotherSet) {
        if (anotherSet instanceof ArraySet) {
            ArraySet aSet = (ArraySet) anotherSet;
            if(aSet.numberOfElements > this.numberOfElements){
                return false;
            }
            for(int i = 0; i < aSet.numberOfElements; i++){
                boolean found = false;
                for(int j = 0; j < numberOfElements & !found; j++){
                    if(aSet.setArray[i].equals(setArray[j])){
                        found = true;
                    }
                }
                if(!found){
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public void union(SetInterface anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SetInterface intersection(SetInterface anotherSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        String outputStr = "";
        for (int index = 0; index < numberOfElements; ++index) {
            outputStr = setArray[index] + "\n";
        }
        return outputStr;
    }

    private void removeGap(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean isArrayFull() {
        return numberOfElements == setArray.length;
    }

    private void doubleArray() {
        T[] oldArray = setArray; //duplicate array elements
        setArray = (T[]) new Object[2 * oldArray.length];
      
        System.arraycopy(oldArray, 0, setArray, 0, numberOfElements);
    }

    @Override
    public Iterator<T> getIterator(){
        return new IteratorForArraySet();
    }
    
    private class IteratorForArraySet implements Iterator<T>{
        private int nextIndex; 

        public IteratorForArraySet(){
            nextIndex = 0;
        }
        @Override
        public boolean hasNext() {
            return nextIndex < numberOfElements;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public T next() {
            if(hasNext()){
                T nextElement = (T) setArray[nextIndex++];
                return nextElement;
                
            }else{
                return null;
            }
        }
    }
    
}
