/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STUDENT;

import java.io.Serializable;

/**
 *
 * @author Shub
 */
public class StuAttendenceCount implements Serializable{
    
    String Stu_id;
    float total_days;
    float present;

    public StuAttendenceCount(String Stu_id, float total_days, float present) {
        this.Stu_id = Stu_id;
        this.total_days = total_days;
        this.present = present;
    }

    public String getStu_id() {
        return Stu_id;
    }

    public float getTotal_days() {
        return total_days;
    }

    public float getPresent() {
        return present;
    }
    
    
}
