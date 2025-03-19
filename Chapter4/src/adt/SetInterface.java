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
public interface SetInterface<T>{
    boolean add(T newElement);
    boolean remove(T anElement);
    boolean checkSubset(SetInterface anotherSet);
    void union(SetInterface anotherSet);
    SetInterface intersection(SetInterface anotherSet);
    boolean isEmpty();
    
    public Iterator<T> getIterator();
}
