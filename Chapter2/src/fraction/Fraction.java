/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

/**
 *
 * @author TARUC
 */
public class Fraction implements FractionInterface{
    private int numerator;
    private int denominator;
    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public boolean setDenominator(int denominator) {
        if (denominator !=0){
            this.denominator = denominator;
            return true;
        }
        return false;
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public FractionInterface add(FractionInterface anotherFraction) {
        Fraction resultFraction = new Fraction();
        resultFraction.numerator = numerator * anotherFraction.getNumerator() + denominator * anotherFraction.getDenominator();
        resultFraction.denominator = denominator * anotherFraction.getDenominator();
        return resultFraction;
    }   

    @Override
    public FractionInterface sub(FractionInterface anotherFraction) {
        Fraction resultFraction = new Fraction();
        resultFraction.numerator = numerator * anotherFraction.getNumerator() + denominator * anotherFraction.getDenominator();
        resultFraction.denominator = denominator * anotherFraction.getDenominator();
        return resultFraction;
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public FractionInterface mul(FractionInterface fi) {
        Fraction resultFraction = new Fraction();
        resultFraction.numerator = numerator * fi.getNumerator();
        resultFraction.denominator = denominator * fi.getDenominator();
        return resultFraction;
    }

    @Override
    public FractionInterface div(FractionInterface fi) {
        Fraction resultFraction = new Fraction();
        resultFraction.numerator = numerator * fi.getDenominator();
        resultFraction.denominator = denominator * fi.getNumerator();
        return resultFraction;
    }
    
    @Override
    public String toString(){
        return numerator +"/" +denominator;
    }
    
}
