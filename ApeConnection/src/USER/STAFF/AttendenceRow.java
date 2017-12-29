/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER.STAFF;

/**
 *
 * @author Shub
 */

public class AttendenceRow {
    String rollno;
    String name;
    boolean present;

    public AttendenceRow(String rollno, String name, boolean present) {
        this.rollno = rollno;
        this.name = name;
        this.present = present;
    }

    
    public String getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return present;
    }

}