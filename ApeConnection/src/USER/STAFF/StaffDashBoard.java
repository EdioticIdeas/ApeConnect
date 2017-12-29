/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER.STAFF;

import USER.DashBoard;
import Util.Lectures;
import java.util.ArrayList;

/**
 *
 * @author Shub
 */
public class StaffDashBoard extends DashBoard{

    private final double attendence;
    private final ArrayList<Lectures> lectureList;

    public StaffDashBoard(double attendence, ArrayList<Lectures> lectureList, String name, String id, String email, ArrayList<String> events, ArrayList<String> notices) {
        super(name, id, email, events, notices);
        this.attendence = attendence;
        this.lectureList = lectureList;
    }
}
