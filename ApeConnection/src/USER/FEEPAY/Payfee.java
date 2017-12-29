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
public class Payfee implements Serializable{
    
    String Session_id;
    String rollno;
    String name;
    String paidSem;
    String fees;
    String Date;
    String ddNumber;

    String receiptNumber;
    
    public Payfee(String Session_id, String rollno, 
            String paidSem, String fees, String Date,
            String ddNumber) {
        this.Session_id = Session_id;
        this.rollno = rollno;
        this.paidSem = paidSem;
        this.fees = fees;
        this.Date = Date;
        this.ddNumber = ddNumber;
    }

    public Payfee(String Session_id, String rollno, String name, 
            String paidSem, String fees, String Date, String ddNumber,
            String receiptNumber) {
        this.Session_id = Session_id;
        this.rollno = rollno;
        this.name = name;
        this.paidSem = paidSem;
        this.fees = fees;
        this.Date = Date;
        this.ddNumber = ddNumber;
        this.receiptNumber = receiptNumber;
    }


    public String getSession_id() {
        return Session_id;
    }

    public String getRollno() {
        return rollno;
    }

    public String getPaidSem() {
        return paidSem;
    }

    public String getFees() {
        return fees;
    }

    public String getDate() {
        return Date;
    }

    public String getDdNumber() {
        return ddNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }
    
    
    
}
