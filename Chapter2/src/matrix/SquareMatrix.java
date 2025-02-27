/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author TARUC
 */
public class SquareMatrix implements MatrixInterface{
    private int[][] matrixArray;
    private int dimension;
    
    public SquareMatrix(int n){
        matrixArray = new int[n][n];
        dimension = n;
    }
    
    @Override
    public void makeEmpty(int m){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrixArray[i][j] =0;
            }
        }
    }

    @Override
    public void storeValue(int i, int j, int value) {
        matrixArray[i][j] = value;
    }

    @Override
    public void add(SquareMatrix sm) {
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] += sm.getMatrixArray()[i][j];
            }
        }
    }

    @Override
    public void copy(SquareMatrix sm) {
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j]= sm.getMatrixArray()[i][j];
            }
        }
    }
    
    
    
    public int getDimension(){
        return dimension;
    }
    
    public int[][] getMatrixArray(){
        return matrixArray;
    }
    
    @Override
    public String toString(){
        String str1 = "";
        for(int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray.length; j++) {
                str1 += matrixArray[i][j]+ " ";
            }
            str1 += "\n";
        }
        return str1;
    }
    
}
