/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER.FEEPAY;

import USER.DashBoard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

/**
 *
 * @author Shub
 */


public class PayementDashboard extends DashBoard implements Serializable{
    
    HashMap<String, String> feepay;
    ArrayList<FeeStructure> feeStruct;

    public PayementDashboard(HashMap<String, String> feepay, ArrayList<FeeStructure> feeStruct, String name, String id, String email, ArrayList<String> events, ArrayList<String> notices) {
        super(name, id, email, events, notices);
        this.feepay = feepay;
        this.feeStruct = feeStruct;
    }

    public HashMap<String, String> getFeepay() {
        return feepay;
    }

    public ArrayList<FeeStructure> getFeeStruct() {
        return feeStruct;
    }
    
    
}
