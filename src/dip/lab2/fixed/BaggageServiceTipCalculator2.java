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

    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;
    private double tip;
    

    public BaggageServiceTipCalculator2(int bags, double baseTipPerBag, ServiceQuality serviceQuality) {
        setBagCount(bags);
        setBaseTipPerBag(baseTipPerBag);
        setServiceQuality(serviceQuality);
    }

    public double getAnnualCompensationForEmployee(Calculator c) {
        

        switch(c.getServiceQuality()) {
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

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }
     public void setServiceQuality(ServiceQuality quality){
        serviceQuality = quality;
    }
    public ServiceQuality getServiceQuality(){
        return serviceQuality;
    }

    @Override
    public double getTip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setServiceQuality() {
       
    }
}
