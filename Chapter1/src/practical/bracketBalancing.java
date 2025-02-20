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
public class bracketBalancing {
    public static boolean checkBalance(String expr){
        Stack<Character> bracketStack = new Stack<>();
        boolean match = true;
        
        
        for (int i = 0; i < expr.length(); i++) {
            // read 
            char ch = expr.charAt(i);
            
            switch (ch) {
                case '(':
                    

                case '[':

                case '{':
                    bracketStack.push(ch);
                    break;
                
                case ')':
                case ']':
                case '}':
                    if(bracketStack.empty()){
                        return false;
                    }
                    char openBracket = bracketStack.pop();
                    
                    switch (ch) {
                        case ')':
                            match = openBracket == '(';
                            break;
                        case ']':
                            match = openBracket == '[';
                            break;
                        case '}':
                            match = openBracket == '{';
                            break;
                    }
            }
        }
        return !(!match || !bracketStack.empty());

    }
}
