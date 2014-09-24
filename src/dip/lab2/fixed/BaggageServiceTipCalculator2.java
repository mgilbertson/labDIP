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
    private double minBill = 0.00;
    private double maxBill = 100.00;
    private String billEntryError =
            "Error: bill must be between " + minBill + " and " + maxBill;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

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
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
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

    public double getMinBill() {
        return minBill;
    }

    public void setMinBill(double minBill) {
        this.minBill = minBill;
    }

    public double getMaxBill() {
        return maxBill;
    }

    public void setMaxBill(double maxBill) {
        this.maxBill = maxBill;
    }

    public String getBillEntryError() {
        return billEntryError;
    }

    public void setBillEntryError(String billEntryError) {
        this.billEntryError = billEntryError;
    }

    public double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }
     

}
