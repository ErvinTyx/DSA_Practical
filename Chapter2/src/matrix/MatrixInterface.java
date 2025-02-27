/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package matrix;

/**
 *
 * @author TARUC
 */
public interface MatrixInterface {
    void makeEmpty(int m);
    void storeValue(int i,int j,int value);
    void add(SquareMatrix matrix);
    void copy(SquareMatrix matrix);
}
