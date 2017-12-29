/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package USER;

import STUDENT.StudentProfile;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Shub
 */
public class StuList implements Serializable{
    
    ArrayList<STUDENT.StudentProfile> list;

    public StuList(ArrayList<StudentProfile> list) {
        this.list = list;
    }

    public ArrayList<StudentProfile> getList() {
        return list;
    }
    
}
