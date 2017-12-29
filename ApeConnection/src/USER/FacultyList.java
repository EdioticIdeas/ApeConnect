/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Shub
 */


public class FacultyList implements Serializable{
    
    ArrayList<Staff> facultyList;
    
    public FacultyList(ArrayList<Staff> facultyList) {
        this.facultyList = facultyList;
    }
    
    public ArrayList<Staff> getFacultyList() {
        return facultyList;
    }
    
}
