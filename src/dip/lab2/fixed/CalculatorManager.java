/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.fixed;

/**
 *
 * @author Mitch
 */
public class CalculatorManager {
    private Calculator calculator;
    
    public CalculatorManager(Calculator calc){
        calculator = calc;
    }
    
    public double getTip(){
        return calculator.getTip();
    }
}
