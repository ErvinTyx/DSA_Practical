/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical;

import java.util.Stack;

/**
 *
 * @author TARUC
 */
public class EvalPostFix {
    public static double evaluetePostFix(String expr){
        Stack<Double> operandStack = new Stack<>();
        double result = 0;
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if(Character.isDigit(ch)){
                operandStack.push((double)(ch -'0'));
            }
            else if(isOperator(ch)){
                double right = operandStack.pop();
                double left = operandStack.pop();
                
                result = performOperation(left,right,ch);
            }
            // check if the ch isDigit
                // yes oush to operandStack
            // else check if isOperator
                // pop rightOperand
                // pop leftOperand
                // result = performOperation
            // end loop
        }
        return result;
    }
    
    private static boolean isOperator(char ch){
        switch (ch) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
            default:
                return false;
        }
    }
    private static double performOperation(double leftOperand, double rightOperand, char ch){
        double result =0;
        switch (ch) {
            case '+':
                result = leftOperand + rightOperand;
                break;
            case '-':
                result=  leftOperand - rightOperand;
                break;
            case '*':
                result=  leftOperand * rightOperand;
                break;
            case '/':
                result=  leftOperand / rightOperand;
                break;
        }
        return result;
    }

}
