/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fraction;

/**
 *
 * @author TARUC
 */
public interface FractionInterface {
    void setNumerator(int numerator);
    boolean setDenominator(int denominator);
    
    int getNumerator();
    int getDenominator();
    
    FractionInterface add(FractionInterface anotherFraction);
    FractionInterface sub(FractionInterface anotherFraction);
    FractionInterface mul(FractionInterface anotherFraction);
    FractionInterface div(FractionInterface anotherFraction);
    
    
}
