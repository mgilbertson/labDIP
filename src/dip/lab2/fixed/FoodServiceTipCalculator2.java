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
public class FoodServiceTipCalculator2 implements Calculator{
    private double minBill = 0.00;
    private String billEntryError =
            "Error: bill must be greater than or equal to " + minBill;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    private double bill;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator2(ServiceQuality quality, double billAmt) {
        this.setServiceQuality(quality);
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(billEntryError);
        }
        bill = billAmt;
    }

    public final void setServiceQuality(ServiceQuality quality) {
        // No need to validate because enums provide type safety!
        serviceQuality = quality;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public double getMinBill() {
        return minBill;
    }

    public void setMinBill(double minBill) {
        this.minBill = minBill;
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
