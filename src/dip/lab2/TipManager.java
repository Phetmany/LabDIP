/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author psent_000
 */
public class TipManager {
    private  TipCalculator calculator;
    
    // constructors
    public TipManager() {
        
    }

    public TipManager(TipCalculator calculator) {
        this.calculator = calculator;
    }
    
    
    // get tips
    public double getTips() {
        System.out.println("Tip amount: " + calculator.getTip());
        return calculator.getTip();
        
    }
    
    // getters and setters

    public TipCalculator getCalculator() {
        return calculator;
    }

    public void setCalculator(TipCalculator calculator) {
        this.calculator = calculator;
    }
    
    
}
