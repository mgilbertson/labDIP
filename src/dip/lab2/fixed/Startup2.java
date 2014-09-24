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
public class Startup2 {

    public static void main(String[] args) {
        Calculator calc1 = new BaggageServiceTipCalculator2(ServiceQuality.GOOD, 5);
         Calculator calc2 = new FoodServiceTipCalculator2(ServiceQuality.GOOD, 5);
         
         CalculatorManager mgr = new CalculatorManager(calc1);
         double amt = mgr.getTip();
         System.out.println(amt);
        
    }
}
