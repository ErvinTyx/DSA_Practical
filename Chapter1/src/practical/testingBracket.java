/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical;

/**
 *
 * @author TARUC
 */
public class testingBracket {
    public static void main(String[] args) {
        String expr1 ="((a+b)";
        String expr2 ="(a+b}";
        System.out.println(expr1 + ": "+ bracketBalancing.checkBalance(expr1));
        System.out.println(expr2 + ": "+ bracketBalancing.checkBalance(expr2));
    }
}
