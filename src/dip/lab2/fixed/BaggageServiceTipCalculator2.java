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
public class BaggageServiceTipCalculator2 implements Calculator{
    //make variables lowercase, create getters/setters for each. 
    //if you have to change the high level class because of lower-level classes you are doing something wrong
    private double MIN_BILL = 0.00;
    private double MAX_BILL = 100.00;
    private String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private double GOOD_RATE = 0.20;
    private double FAIR_RATE = 0.15;
    private double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;
    private double tip;
    

    public BaggageServiceTipCalculator2(ServiceQuality quality, int bags) {
        setBagCount(bags);
        setServiceQuality(quality);
    }

    @Override
    public double getTip() {
        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }
        return tip;
    }


    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }


    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }
    

     public final void setServiceQuality(ServiceQuality quality){
        serviceQuality = quality;
    }

}
