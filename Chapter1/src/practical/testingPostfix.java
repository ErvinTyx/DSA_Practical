/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical;

/**
 *
 * @author TARUC
 */
public class testingPostfix {
    public static void main(String[] args) {
        String expr1 ="15+";
        String expr2 ="47-";
        String expr3 ="93*";
        String expr4 ="93/";
        
        System.out.println(EvalPostFix.evaluetePostFix(expr1));
        System.out.println(EvalPostFix.evaluetePostFix(expr2));
        System.out.println(EvalPostFix.evaluetePostFix(expr3));
        System.out.println(EvalPostFix.evaluetePostFix(expr4));

    }
}
