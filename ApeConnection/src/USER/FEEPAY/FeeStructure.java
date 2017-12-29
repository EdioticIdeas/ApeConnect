/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER.FEEPAY;

import java.io.Serializable;

/**
 *
 * @author Shub
 */
public class FeeStructure implements Serializable{

    
    
    private String tutionFee;
    private String developmentFee;
    private String managementFee;
    private String admissionFee;
    private String maintenenceFee;

    public FeeStructure(String tutionFee, String developmentFee, String managementFee, String admissionFee, String maintenenceFee) {
        this.tutionFee = tutionFee;
        this.developmentFee = developmentFee;
        this.managementFee = managementFee;
        this.admissionFee = admissionFee;
        this.maintenenceFee = maintenenceFee;
    }
    
    public String getTutionFee() {
        return tutionFee;
    }

    public String getDevelopmentFee() {
        return developmentFee;
    }

    public String getManagementFee() {
        return managementFee;
    }

    public String getAdmissionFee() {
        return admissionFee;
    }

    public String getMaintenenceFee() {
        return maintenenceFee;
    }
}
