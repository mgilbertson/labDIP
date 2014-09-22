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
    private enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;
    
    public CalculatorManager(Calculator serviceQuality, 
    }
    
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    public double getAnnualCompensationForEmployee(Employee e) {
        return e.getAnnualWages();
    }
}
