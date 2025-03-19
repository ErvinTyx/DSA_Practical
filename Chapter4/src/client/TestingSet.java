/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import adt.ArraySet;
import adt.SetInterface;
import java.util.Iterator;

/**
 *
 * @author TARUMT
 */
public class TestingSet {
    public static void main(String[] args){
        SetInterface<Integer> setA = new ArraySet<>();
        
        setA.add(20);
        setA.add(30);
        setA.add(40);
        
        System.out.println("Set A: \n" + setA);
                
        SetInterface<Integer> setB = new ArraySet<>();
        
        setB.add(30);
        setB.add(40);
        
        System.out.println("Set B: \n" + setB);
        
        System.out.println(setA.checkSubset(setB) + "\nSet B subset Set A: ");
        
        
        Iterator<Integer> iterator = setA.getIterator();
        
        System.out.println("Elements in the set:");
        int sum = 0;
        int num = 0;
        while(iterator.hasNext()){
            num = iterator.next();
            sum += num;
            System.out.println("Element in the set is:" + num);
        }
        System.out.println("total in the set:" + sum);
    }
}
