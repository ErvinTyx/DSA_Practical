/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author ervin
 */
public class MatrixDriver {
    public static void main(String[] args) {
        SquareMatrix matrix1 = new SquareMatrix(3);
        SquareMatrix matrix2 = new SquareMatrix(3);
        System.out.println(matrix1);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1.storeValue(i, j, j+1);
            }
        }
        System.out.println(matrix1);
        matrix2.copy(matrix1);
        
        System.out.println(matrix2);
        
        matrix1.add(matrix2);
        
        System.out.println(matrix1);
    }
}
